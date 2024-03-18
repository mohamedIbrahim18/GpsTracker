package com.example.base

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

fun Activity.showDialog(
    context: Context,
    message: String,
    posActionName: String?=null,
    posAction: DialogInterface.OnClickListener? = null,
    negActionName: String?=null,
    negAction: DialogInterface.OnClickListener? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(context)
    dialog.setMessage(message)
    dialog.setPositiveButton(posActionName, posAction)
    dialog.setNegativeButton(negActionName, negAction)
    return dialog.show()
}