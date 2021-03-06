package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {


    var option = -1

    lateinit var navController: NavController




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)


        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option : Int){

        when(option){
            1 -> {
                tv_main.text = "당신은 포기자예요!"
                tv_sub.text ="당신은 그 사람을 쉽게 허락할 수 있습니다."
            }

            2 -> {
                tv_main.text="당신은 자신에게 집중해야 한다."
                tv_sub.text="당신은 전애인에게 정말 집착하게 됩니다."

            }

            3-> {
                tv_main.text="당신은 진정해야 돼요."
                tv_sub.text="당신은 무슨 일이 있으면 미친 짓도 할 수 있어요."
            }

            4-> {
                tv_main.text="당신은 꽤 성숙하군요."
                tv_sub.text="당신은 쉽게 이별을 받아들일 수 있어요."
            }
        }
    }








}