package mohammed.zahid.khan.dxbapps.navigations

import mohammed.zahid.khan.dxbapps.utility.Utils.accountIcon
import mohammed.zahid.khan.dxbapps.utility.Utils.homeIcon
import mohammed.zahid.khan.dxbapps.utility.Utils.newOrderIcon
import mohammed.zahid.khan.dxbapps.utility.Utils.notificationIcon
import mohammed.zahid.khan.dxbapps.utility.Utils.orderIcon


sealed class Screens(val route: String, val title : String, val icon : (Boolean)-> Int, val isActive : Boolean= true) {


    object Home : Screens(route = "home", title = "Home", icon = {
        homeIcon(it)
    })

    object Order : Screens(route = "order", title = "Orders", icon = {
        orderIcon(it)
    })

    object NewOrder : Screens(route = "new_order", title = "New Orders", icon = {
        newOrderIcon()
    })

    object Notifications : Screens(route = "notifications", title = "Notifications", icon = {
        notificationIcon(it)
    })

    object MyAccount : Screens(route = "my_account", title = "My Account", icon = {
        accountIcon(it)
    })

    object Empty : Screens(route = "", title = "", isActive = false, icon = {
        -1
    })


}