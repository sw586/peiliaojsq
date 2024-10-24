<template>
  <div>
    <h2>Ingredients List</h2>
    <el-table :data="ingredients" style="width: 100%">
      <el-table-column prop="id" label="ID" />
      <el-table-column prop="name" label="Name" />
      <el-table-column prop="parent_id" label="Parent ID" />
    </el-table>
  </div>
</template>

<script>
import { ref, onMounted } from 'vue';
import axios from 'axios';

export default {
  name: 'IngredientsList',
  setup() {
    const ingredients = ref([]);

    const fetchIngredients = async () => {
      try {
        const response = await axios.get('http://localhost:8080/api/ingredients');
        ingredients.value = response.data;
      } catch (error) {
        console.error('Failed to fetch ingredients:', error);
      }
    };

    onMounted(fetchIngredients);

    return {
      ingredients,
    };
  },
};
</script>

<style scoped>
/* 添加任何需要的样式 */
</style>
