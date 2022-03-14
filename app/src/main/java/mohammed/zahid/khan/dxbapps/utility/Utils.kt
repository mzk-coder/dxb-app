package mohammed.zahid.khan.dxbapps.utility

import mohammed.zahid.khan.dxbapps.R
import mohammed.zahid.khan.dxbapps.data.models.HomeItem

object Utils {
    val homeItemList = listOf(
        HomeItem(R.drawable.ic_order,"ORDER"),
        HomeItem(R.drawable.ic_hiw,"HOW IT WORKS"),
        HomeItem(R.drawable.ic_about_us,"ABOUT US"),
        HomeItem(R.drawable.ic_contact,"CONTACT US")
    )

    fun homeIcon(isActive : Boolean=false) : Int{
        return if (isActive){
            R.drawable.home_selected
        }else{
            R.drawable.home_normal
        }
    }

    fun notificationIcon(isActive : Boolean=false) : Int{
        return if (isActive){
            R.drawable.notification_selected
        }else{
            R.drawable.notification_normal
        }
    }

    fun orderIcon(isActive : Boolean=false) : Int{
        return if (isActive){
            R.drawable.order_selected
        }else{
            R.drawable.order_normal
        }
    }

    fun accountIcon(isActive : Boolean=false) : Int{
        return if (isActive){
            R.drawable.account_selected
        }else{
            R.drawable.account_normal
        }
    }

    fun newOrderIcon() : Int{
        return R.drawable.new_order_icon
    }
}
