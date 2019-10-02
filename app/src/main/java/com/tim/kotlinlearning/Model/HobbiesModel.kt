package com.tim.kotlinlearning.Model

data class HobbiesModel(var name: String)

class Supplier
{
  companion object {

      val hobbiesList: List<HobbiesModel> = listOf<HobbiesModel>(
          HobbiesModel("Swimming"),
          HobbiesModel("Gaming"),
          HobbiesModel("Dancing"),
          HobbiesModel("Travelling"),
          HobbiesModel("Eating"),
          HobbiesModel("Managing"),
          HobbiesModel("Treating"),
          HobbiesModel("opposing"),
          HobbiesModel("Taunting"),
          HobbiesModel("Preapring"),
          HobbiesModel("Walking"),
          HobbiesModel("Swimming"),
          HobbiesModel("Reading"),
          HobbiesModel("Swimming"),
          HobbiesModel("Writing"),
          HobbiesModel("Swimming"),
          HobbiesModel("Chating"),
          HobbiesModel("Swimming"),
          HobbiesModel("Sleeping"),
          HobbiesModel("Swimming")
      )
  }
}