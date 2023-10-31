package com.example.flavorsofmiami.data.local

import com.example.flavorsofmiami.R
import com.example.flavorsofmiami.data.model.Category
import com.example.flavorsofmiami.data.model.Recommendation

object Datasource {

    val recommendations = listOf(
        Recommendation(
            R.string.chua_buu_long,
            R.string.chua_buu_long_description,
            R.drawable.chua_buu_long,
            Category.PAGODA
        ),
        Recommendation(
            R.string.chua_giac_lam,
            R.string.chua_giac_lam_description,
            R.drawable.chua_giac_lam,
            Category.PAGODA
        ),
        Recommendation(
            R.string.chua_vinh_nghiem,
            R.string.chua_vinh_nghiem_description,
            R.drawable.chua_vinh_nghiem,
            Category.PAGODA
        ),
        Recommendation(
            R.string.wedding_1_title,
            R.string.wedding_1_description,
            R.drawable.wedding_1,
            Category.WEDDING
        ),
        Recommendation(
            R.string.wedding_2_title,
            R.string.wedding_2_description,
            R.drawable.wedding_2,
            Category.WEDDING
        ),
        Recommendation(
            R.string.wedding_3_title,
            R.string.wedding_3_description,
            R.drawable.wedding_3,
            Category.WEDDING
        ),
        Recommendation(
            R.string.hotel_1_title,
            R.string.hotel_1_description,
            R.drawable.hotel_1,
            Category.HOTEL
        ),
        Recommendation(
            R.string.hotel_2_title,
            R.string.hotel_2_description,
            R.drawable.hotel_2,
            Category.HOTEL
        ),
        Recommendation(
            R.string.hotel_3_title,
            R.string.hotel_3_description,
            R.drawable.hotel_3,
            Category.HOTEL
        )
    )
}