
package com.proflex.notebook

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var container: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scroll = ScrollView(this)
        container = LinearLayout(this)
        container.orientation = LinearLayout.VERTICAL

        val title = EditText(this)
        title.hint = "1st Headline"

        val addBtn = Button(this)
        addBtn.text = "Add Headline"

        val details = EditText(this)
        details.hint = "Details"
        details.minLines = 5

        addBtn.setOnClickListener {
            val et = EditText(this)
            et.hint = "New Headline"
            container.addView(et)
        }

        container.addView(title)
        container.addView(addBtn)
        container.addView(details)

        scroll.addView(container)
        setContentView(scroll)
    }
}
