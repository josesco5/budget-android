package com.avilapps.budget.dashboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.avilapps.budget.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setupViews()
    }

    fun setupViews() {
        val fragmentTransaction = this.fragmentManager.beginTransaction()
        var fragment = BudgetsFragment()
        fragmentTransaction.replace(R.id.content, fragment)
        fragmentTransaction.commit()
    }
}
