package kun.hee.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kun.hee.sharedpreferences.Utils.ContextUtil

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {
        val inputId = idEdt.text.toString()
        ContextUtil.setUserId(mContext, inputId)

    }

    override fun setValues() {

        idEdt.setText(ContextUtil.getUserId(mContext)) //editText는  settext쓰고, textview는 .text = 함.

    }


}
