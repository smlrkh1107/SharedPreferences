package kun.hee.sharedpreferences.Utils

import android.content.Context

class ContextUtil {


    companion object{ // Java의 static 변수 / 메쏘드에 해당하는 코드들을 적는 영역.

        private val prefName = "MyPref" // id를 받아 저장할 ""파일명""
        private val USER_ID = "USER_ID" // 저장될 항목의 이름.(그 사람 코드? 그사람이 사용하는 정보(id)XXX)
        private val ID_SAVE = "ID_SAVE"

//        setter:데이터 저장용 함수
        fun setUserId (context: Context, inputId:String){ //★메모장 파일을 여는 행위
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                                // 저장할 파일을 열어라(파일명, 우리앱전용으로쓸께)
            // USER_ID항목에 함수의 재료로 들어오는 String 변수 저장.
            pref.edit().putString(USER_ID, inputId).apply() //아이디를 입력받은 값으로 저장(apply)해 주겠다.
        }

//        getter:데이터 조회용 함수
        fun getUserId (context: Context) : String {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(USER_ID, "")!!

        }

        fun setSaveId(context: Context, isSave:Boolean){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(ID_SAVE, isSave).apply()
        }

        fun getSaveId(context: Context) :Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(ID_SAVE,false)
        }


    }
}