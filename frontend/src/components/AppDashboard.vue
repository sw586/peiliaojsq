<!-- 文件路径：frontend/src/components/AppDashboard.vue -->
<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="12">
        <el-card shadow="hover">
          <div>Total Recipes: {{ recipesCount }}</div>
        </el-card>
      </el-col>
      <el-col :span="12">
        <el-card shadow="hover">
          <div>Total Ingredients: {{ ingredientsCount }}</div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import axios from "axios";
import { ref, onMounted } from "vue";

export default {
  name: "AppDashboard",
  setup() {
    const recipesCount = ref(0);
    const ingredientsCount = ref(0);

    const getRecipesCount = async () => {
      try {
        const response = await axios.get("http://localhost:8080/api/recipes/count");
        recipesCount.value = response.data;
      } catch (error) {
        console.error("Failed to fetch recipes count:", error);
      }
    };

    const getIngredientsCount = async () => {
      try {
        const response = await axios.get("http://localhost:8080/api/ingredients/count");
        ingredientsCount.value = response.data;
      } catch (error) {
        console.error("Failed to fetch ingredients count:", error);
      }
    };

    onMounted(() => {
      getRecipesCount();
      getIngredientsCount();
    });

    return {
      recipesCount,
      ingredientsCount,
    };
  },
};
</script>

<style scoped>
.el-card {
  text-align: center;
  font-size: 20px;
  font-weight: bold;
}
</style>
