package org.autojs.autojs.nkScript

import android.app.Application
import android.util.Log
import com.stardust.app.GlobalAppContext
import org.autojs.autojs.autojs.AutoJs
import org.autojs.autojs.nkScript.interImp.InterMy
import org.autojs.autojs.nkScript.interImp.SetNode
import org.autojs.autojs.nkScript.interImp.SimpleActionAutomatorImp
import org.autojs.autojs.nkScript.interImp.UiSelectorImp
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class Run {

    lateinit var listExecutorService: ArrayList<ExecutorService>;
    lateinit var poolMain: ExecutorService
    lateinit var poolSub: ExecutorService
    var TAG:String="Run"
    var setNode=SetNode();
    //var listExecutorService = arrayListOf<ExecutorService>();

    var clk: SimpleActionAutomatorImp? = null
    lateinit var node: UiSelectorImp;

    fun main(){
        init()
        // threadInterrruptedForce();
        poolMain = Executors.newFixedThreadPool(1)
        poolSub = Executors.newFixedThreadPool(1)

        poolMain = InterMy.ThreadStart( { jk2() }, 1)
        listExecutorService= ArrayList();
        listExecutorService.add( poolMain );

    }

    fun jk2() {

        while (true) {
            Log.d(TAG, "jk2: run")
            var ver="0825h"
            GlobalAppContext.toast("ver="+ver )
            Log.d(TAG,"ver="+ver);

            try {
                var ret= node.fnode(setNode.xx系统 );
                if (ret!=null){
                    Log.d(TAG,"bounds="+ret.bounds()   )
                }else
                    Log.d( TAG,"未找到"  );

                Log.d(TAG,ver)
                        Thread.sleep(1000)

            } catch (e: InterruptedException) {
                Log.d(TAG, "jk2: InterruptedException")
                e.printStackTrace()
                break
            }

        }
    }

    fun init(){
        AutoJs.initInstance(GlobalAppContext.get() as Application?)
        clk = SimpleActionAutomatorImp()
        node = UiSelectorImp()
    }

}