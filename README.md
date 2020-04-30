# LEARNANDROID ABOUTME APP
- Mengetahui Attribute Baru
  -android:visibility : gone (Hilang)
                        visible (Tampil)
                        invisible (Sembunyi)
- Mengetahui view ScrollView
- Membuat data class MyName untuk dapat menyimpan dan memanggil value Name dan Nickname
- Menggunakan data bindings untuk 
  1. Cara lain memanggil id(findViewById()) pada tiap view
- Cara Menggunakan data bindings
  1. Pada activity_main.xml buat view Layout (<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">) yang merangkum Viewgroup.
  2. Pada MainActivity.kt membuat inialisasi variable bindings (lateinit var binding:ActivityMainBinding)
  3. Pada MainActivity.kt mengubah pemanggilan view menjadi menggunakan bindings(binding = DataBindingUtil.setContentView(this,     R.layout.activity_main))
  4. Pada MainActivity.kt membuat reference setOnclickListener pada button menggunakan bindings (binding.btnDone.setOnClickListener {
    addNickname(it)})
  5. Pada activity_main.xml membuat view 
      <data>
         <variable
                name="MyName"
                type="com.example.aboutme.MyName" />
        </data>
     Digunakan untuk mendapatkan data yang ada pada data class MyName (com.example.aboutme.MyName) yang dapat dipanggil mengguunakan (MyName.'nama attribute data classnya') pada value setiap View yang ada di activity_main.xml (android:text="@={MyName.name}")
  6. invalidateAll()  which will trigger a rebind of everything
