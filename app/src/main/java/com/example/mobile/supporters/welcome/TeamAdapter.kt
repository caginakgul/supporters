package com.example.mobile.supporters.welcome

import android.content.ClipData
import android.support.v7.widget.RecyclerView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mobile.supporters.R
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import com.example.mobile.supporters.BR
import com.example.mobile.supporters.databinding.RowTeamBinding

/**
 * Created by mobile on 9.05.2018.
 */
class TeamAdapter(teams : List<TeamModel>, ctx:Context): RecyclerView.Adapter<TeamAdapter.TeamAdapterViewHolder>() {

    var context = ctx
    var list = teams

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TeamAdapterViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding: ViewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.row_team, parent, false)
        return TeamAdapter.TeamAdapterViewHolder(binding)


      //  return TeamAdapterViewHolder(LayoutInflater.from(context).inflate(R.layout.row_team,parent,false))
    }

    override fun onBindViewHolder(holder: TeamAdapterViewHolder?, position: Int) {

        var team = list[position]
        holder!!.bind(team)
        //holder?.tvTeamName?.text = list.get(position).teamName
    }

    class TeamAdapterViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Any) {
            binding.setVariable(BR.team, data)
            binding.executePendingBindings()
        }

      /*  var tvTeamName: TextView

        init {
            tvTeamName = view.findViewById(R.id.tvTeamRow)
        }

        fun bindData(teamModel: TeamModel) {
            tvTeamName.setText(teamModel.teamName)
        }*/

    }

}