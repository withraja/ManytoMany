Tugas ini dibuat untuk SYNRGY Academy Batch 4
BackEnd Developer JAVA

=============================================

Saya membuat Class Student, Course, CourseRating sehingga membentuk tiga tabel dengan keterangan sebagai berikut:

Table student memiliki field:
1. id (Long)
2. name (String)
3. gpa (Double)
4. address (String)

Table course memiliki field:
1. id (Long)
2. name (String)

Table course_rating memiliki field:
1. course_id
2. student_id
3. rating (Integer)

Hubungan antara student dengan course_rating adalah oneToMany

Hubungan antara course dengan course_rating adalah oneToMany

Tabel course_rating memiliki primary key yang terdiri atas dua field: course_id dan student_id

Referensi: https://www.baeldung.com/jpa-many-to-many
