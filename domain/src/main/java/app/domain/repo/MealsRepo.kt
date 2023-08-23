package app.domain.repo

import app.domain.entity.CategoryResponse

interface MealsRepo {

   suspend fun getMealsFromRemote() : CategoryResponse

}