package com.example.threadsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_home.profile1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if (savedInstanceState == null) {
            displayFragment(homeFragment())
        }



        search_btn.setOnClickListener {
            displayFragment(searchFragment())
            search_btn.setImageResource(R.drawable.ic_search_clicked)
            home_btn.setImageResource(R.drawable.ic_home)
            likes_btn.setImageResource(R.drawable.ic_heart)
            person_btn.setImageResource(R.drawable.ic_person)

        }

        home_btn.setOnClickListener {
            displayFragment(homeFragment())
            search_btn.setImageResource(R.drawable.ic_search)
            home_btn.setImageResource(R.drawable.ic_home_filler)
            likes_btn.setImageResource(R.drawable.ic_heart)
            person_btn.setImageResource(R.drawable.ic_person)

        }

        likes_btn.setOnClickListener {
            displayFragment(likesFragment())
            search_btn.setImageResource(R.drawable.ic_search)
            home_btn.setImageResource(R.drawable.ic_home)
            likes_btn.setImageResource(R.drawable.ic_heart_filler)
            person_btn.setImageResource(R.drawable.ic_person)

        }

        person_btn.setOnClickListener {
            displayFragment(profilFragment())
            search_btn.setImageResource(R.drawable.ic_search)
            home_btn.setImageResource(R.drawable.ic_home)
            likes_btn.setImageResource(R.drawable.ic_heart)
            person_btn.setImageResource(R.drawable.ic_person_filler)
        }

    }

    private fun displayFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frag_container, fragment)
            .commit()
    }

}




