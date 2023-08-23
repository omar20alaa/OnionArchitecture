package app.data.repo

import app.data.remote.ApiService
import app.domain.entity.CategoryResponse
import app.domain.repo.MealsRepo

class MealsRepositoryImp(private val apiService: ApiService) : MealsRepo {

    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()


}