package com.example.mobilewalletapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

}
class TransactionAdapter (var commentsList: List<Transaction>, var context: Context): RecyclerView.Adapter<TransactionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var  itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.activity_transaction,parent,false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        var currentTransaction=transactionsList.get(position)
        holder.tvaccountName.text=currentTransaction.accountname
        holder.tvCurrency.text=currentTransaction.currency
        holder.tvBalance.text=currentTransaction.balance

    }

    override fun getItemCount(): Int {
        return commentsList.size
    }
}

class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvaccountName=itemView.findViewById<TextView>(R.id.tvaccountName)
    var tvCurrency=itemView.findViewById<TextView>(R.id.tvCurrency)
    var tvBalance=itemView.findViewById<TextView>(R.id.tvBalance)
    var tvTransactionAmount=itemView.findViewById<TextView>(R.id.tvtransactionAmount)


}