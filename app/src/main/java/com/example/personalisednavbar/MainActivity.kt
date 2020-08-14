package com.example.personalisednavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btnBookmark.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, BookmarksFragment())
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    commit()
                }

            }

            btnHome.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, HomeFragment())
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    commit()
                }

            }


            btnContacts.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, ContactsFragment())
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    commit()
                }

            }

    }
}