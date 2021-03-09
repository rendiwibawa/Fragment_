# Fragment_

# Intent & Layout

<a href="https://www.fsf.org">
	<img align="right" src="https://github.com/rendiwibawa/Layout_dan_Intent/blob/master/ezgif.com-gif-maker%20(3).gif">
</a>

### 💻 component App  :
- [x]	Intent
- [x]	Layout (Relative,Linear,Constraint)

### 🤳 Pengertian fragment dan Lifecycle
𝗙𝗥𝗔𝗚𝗠𝗘𝗡𝗧
Fragment adalah sebuah reuseable class yang mengimplement beberapa fitur sebuah Activity. Fragment biasanya dibuat sebagai bagian dari suatu antarmuka. Sebuah fragment harus berada di dalam sebuah activity, mereka tidak dapat berjalan sendiri tanpa adanya activity tempat mereka menempel.

𝗙𝗥𝗔𝗚𝗠𝗘𝗡𝗧 𝗟𝗜𝗙𝗘𝗖𝗬𝗖𝗟𝗘	𝗣𝗘𝗡𝗝𝗘𝗟𝗔𝗦𝗔𝗡
'onAttach()'	dipanggil saat sebuah fragment terhubung ke activity.
'onCreate()'	dipanggil saat sebuah fragment dibuat (objeknya di memori).
'onCreateView()'	dipanggil saat fragment sudah siap membaca sebuah layout.
'onViewCreated()'	dipanggil setelah 'onCreateView()' dan memastikan layout yang dibaca fragment adalah non-null. Semua pengaturan view seperti pembacaan findViewById, menambah onClickListener dapat dilakukan di sini.
'onActivityCreated()'	dipanggil setelah activity pembaca sudah menyelesaikan 'onCreate()'-nya.
'onStart()'	dipanggil setelah fragment siap untuk ditampilkan di layar.
'onResume()'	Dipakai untuk melakukan pembacaan data yang lebih “rumit” seperti lokasi, sensor, dll.
'onPause()'	Tempat melepas data “rumit”. Lakukan commit di sini.
'onDestroyView()'	dipanggil saat layout sebuah fragment akan dihapus dari memori, namun fragmentnya masih ada di memori.
'onDestroy()'	dipanggil jika fragment sudah tidak dipakai.
'onDetach()'	dipanggil saat fragment tidak lagi terhubung ke sebuah activity.


<p align="center">
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/java/java-ar21.svg"></code>
  </a>
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/android/android-ar21.svg"></code>
  </a>
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/gradle/gradle-ar21.svg"></code>
  </a>
</p>





