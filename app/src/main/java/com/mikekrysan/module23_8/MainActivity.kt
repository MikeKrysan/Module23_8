package com.mikekrysan.module23_8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.mikekrysan.module23_8.adapter.MyAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        //SnapHelper*
//        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
//        val snapHelper1 = LinearSnapHelper()
//        snapHelper1.attachToRecyclerView(recyclerView1)
//
//        fun data() : ArrayList<Fruit> = arrayListOf(
//            Fruit(R.drawable.ic_apple, "Apple"),
//            Fruit(R.drawable.ic_banana, "Banana"),
//            Fruit(R.drawable.ic_lemon, "Lemon"),
//            Fruit(R.drawable.ic_orange, "Orange"),
//            Fruit(R.drawable.ic_pear, "Pear"),
//            Fruit(R.drawable.ic_pear, "Pear1"),
//            Fruit(R.drawable.ic_pear, "Pear2"),
//            Fruit(R.drawable.ic_pear, "Pear3"),
//            Fruit(R.drawable.ic_strawberry, "Strawberry"),
//        )
//
//        recyclerView1.adapter = MyAdapter(data())
//
//        //PageSnapHelper**
//        val recyclerView2 = findViewById<RecyclerView>(R.id.recycler_view2)
//        val snapHelper2 = PagerSnapHelper()
//        snapHelper2.attachToRecyclerView(recyclerView2)
//
//        recyclerView2.adapter = MyAdapter(data())
//    }

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val pageSnapHelper = PagerSnapHelper()
        pageSnapHelper.attachToRecyclerView(recyclerView)
        recyclerView.adapter = MyAdapter()

    }
}

//*Иногда в RecyclerView необходимо отобразить список данных, каждый элемент которого нужно видеть целиком. Обычное пролистывание (scrolling) позволяет остановиться в любом месте,
// что является проблемой. Чтобы реализовать возможность доведения до элемента при пролистывании, используется встроенный в RecyclerView класс SnapHelper.

//**Данный класс позволяет пролистывать элементы «страницами». Основное отличие от LinearSnapHelper заключается в том, что нельзя перескочить сразу через несколько элементов списка
// при пролистывании (scrolling). Этот класс меняет физику скролла. Когда пользователь отпускает палец, PagerSnapHelper рассчитывает, какой элемент списка находится ближе всего к
// осевой линии списка, и с плавной анимацией выравнивает его точно по центру.
//Таким образом, если swipe очень резкий, список пролистывается к следующему элементу, в противном случае — с анимацией возвращается в исходное состояние. С помощью данного класса
// можно реализовать поведение как в ViewPager.