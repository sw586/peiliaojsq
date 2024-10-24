<script>
import axios from "axios";
import { ref, onMounted } from "vue";

export default {
  name: "RecipesList",
  setup() {
    const recipes = ref([]);

    const fetchRecipes = async () => {
      try {
        const response = await axios.get("http://localhost:8080/api/recipes");
        // 确保 response.data 是数组
        recipes.value = Array.isArray(response.data) ? response.data : [];
      } catch (error) {
        console.error("Failed to fetch recipes:", error);
      }
    };

    onMounted(fetchRecipes);

    return {
      recipes,
    };
  },
};
</script>

<template>
  <div>
    <el-table :data="recipes">
      <el-table-column prop="id" label="ID" />
      <el-table-column prop="name" label="Recipe Name" />
      <el-table-column prop="parentRecipe.name" label="Parent Recipe" />
    </el-table>
  </div>
</template>

<style scoped>
/* 你的样式 */
</style>
