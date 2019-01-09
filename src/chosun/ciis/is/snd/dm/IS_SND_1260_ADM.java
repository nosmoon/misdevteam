/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.ds.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1260_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String wh_cd;
	public String send_dt;
	public String send_seq;
	public String send_atic_no;
	public String send_atic_nm;
	public String sendclsf;
	public String serv_ref;
	public String cntc_plac;
	public String send_fee;
	public String start_tm;
	public String end_tm;
	public String remk;
	public String send_cmpy_cd;
	public String advcs_cd;
	public String std_cd;
	public String scat_dt;
	public String bnch_qty;
	public String qunt;
	public String bnch_qunt;
	public String asnt_dstc_cd;
	public String purc_dlco_no;
	public String dstc_seqo;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String purc_reg_dt;
	public String purc_reg_seq;
	public String group_cnt;
	public String group_order;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SND_1260_ADM(){}
	public IS_SND_1260_ADM(String flag, String cmpy_cd, String wh_cd, String send_dt, String send_seq, String send_atic_no, String send_atic_nm, String sendclsf, String serv_ref, String cntc_plac, String send_fee, String start_tm, String end_tm, String remk, String send_cmpy_cd, String advcs_cd, String std_cd, String scat_dt, String bnch_qty, String qunt, String bnch_qunt, String asnt_dstc_cd, String purc_dlco_no, String dstc_seqo, String dept_cd, String sub_dept_cd, String chrg_pers, String acwr_reg_dt, String acwr_reg_seq, String purc_reg_dt, String purc_reg_seq, String group_cnt, String group_order, String incmg_pers, String incmg_pers_ip){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.wh_cd = wh_cd;
		this.send_dt = send_dt;
		this.send_seq = send_seq;
		this.send_atic_no = send_atic_no;
		this.send_atic_nm = send_atic_nm;
		this.sendclsf = sendclsf;
		this.serv_ref = serv_ref;
		this.cntc_plac = cntc_plac;
		this.send_fee = send_fee;
		this.start_tm = start_tm;
		this.end_tm = end_tm;
		this.remk = remk;
		this.send_cmpy_cd = send_cmpy_cd;
		this.advcs_cd = advcs_cd;
		this.std_cd = std_cd;
		this.scat_dt = scat_dt;
		this.bnch_qty = bnch_qty;
		this.qunt = qunt;
		this.bnch_qunt = bnch_qunt;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.purc_dlco_no = purc_dlco_no;
		this.dstc_seqo = dstc_seqo;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.purc_reg_dt = purc_reg_dt;
		this.purc_reg_seq = purc_reg_seq;
		this.group_cnt = group_cnt;
		this.group_order = group_order;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setSend_seq(String send_seq){
		this.send_seq = send_seq;
	}

	public void setSend_atic_no(String send_atic_no){
		this.send_atic_no = send_atic_no;
	}

	public void setSend_atic_nm(String send_atic_nm){
		this.send_atic_nm = send_atic_nm;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setServ_ref(String serv_ref){
		this.serv_ref = serv_ref;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setSend_fee(String send_fee){
		this.send_fee = send_fee;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setEnd_tm(String end_tm){
		this.end_tm = end_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSend_cmpy_cd(String send_cmpy_cd){
		this.send_cmpy_cd = send_cmpy_cd;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setBnch_qty(String bnch_qty){
		this.bnch_qty = bnch_qty;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setBnch_qunt(String bnch_qunt){
		this.bnch_qunt = bnch_qunt;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
	}

	public void setDstc_seqo(String dstc_seqo){
		this.dstc_seqo = dstc_seqo;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setPurc_reg_dt(String purc_reg_dt){
		this.purc_reg_dt = purc_reg_dt;
	}

	public void setPurc_reg_seq(String purc_reg_seq){
		this.purc_reg_seq = purc_reg_seq;
	}

	public void setGroup_cnt(String group_cnt){
		this.group_cnt = group_cnt;
	}

	public void setGroup_order(String group_order){
		this.group_order = group_order;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getSend_seq(){
		return this.send_seq;
	}

	public String getSend_atic_no(){
		return this.send_atic_no;
	}

	public String getSend_atic_nm(){
		return this.send_atic_nm;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getServ_ref(){
		return this.serv_ref;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getSend_fee(){
		return this.send_fee;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getEnd_tm(){
		return this.end_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSend_cmpy_cd(){
		return this.send_cmpy_cd;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getBnch_qty(){
		return this.bnch_qty;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getBnch_qunt(){
		return this.bnch_qunt;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
	}

	public String getDstc_seqo(){
		return this.dstc_seqo;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getPurc_reg_dt(){
		return this.purc_reg_dt;
	}

	public String getPurc_reg_seq(){
		return this.purc_reg_seq;
	}

	public String getGroup_cnt(){
		return this.group_cnt;
	}

	public String getGroup_order(){
		return this.group_order;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1260_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1260_ADM dm = (IS_SND_1260_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.wh_cd);
		cstmt.setString(6, dm.send_dt);
		cstmt.setString(7, dm.send_seq);
		cstmt.setString(8, dm.send_atic_no);
		cstmt.setString(9, dm.send_atic_nm);
		cstmt.setString(10, dm.sendclsf);
		cstmt.setString(11, dm.serv_ref);
		cstmt.setString(12, dm.cntc_plac);
		cstmt.setString(13, dm.send_fee);
		cstmt.setString(14, dm.start_tm);
		cstmt.setString(15, dm.end_tm);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.send_cmpy_cd);
		cstmt.setString(18, dm.advcs_cd);
		cstmt.setString(19, dm.std_cd);
		cstmt.setString(20, dm.scat_dt);
		cstmt.setString(21, dm.bnch_qty);
		cstmt.setString(22, dm.qunt);
		cstmt.setString(23, dm.bnch_qunt);
		cstmt.setString(24, dm.asnt_dstc_cd);
		cstmt.setString(25, dm.purc_dlco_no);
		cstmt.setString(26, dm.dstc_seqo);
		cstmt.setString(27, dm.dept_cd);
		cstmt.setString(28, dm.sub_dept_cd);
		cstmt.setString(29, dm.chrg_pers);
		cstmt.setString(30, dm.acwr_reg_dt);
		cstmt.setString(31, dm.acwr_reg_seq);
		cstmt.setString(32, dm.purc_reg_dt);
		cstmt.setString(33, dm.purc_reg_seq);
		cstmt.setString(34, dm.group_cnt);
		cstmt.setString(35, dm.group_order);
		cstmt.setString(36, dm.incmg_pers);
		cstmt.setString(37, dm.incmg_pers_ip);
		cstmt.registerOutParameter(38, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1260_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("send_dt = [" + getSend_dt() + "]");
		System.out.println("send_seq = [" + getSend_seq() + "]");
		System.out.println("send_atic_no = [" + getSend_atic_no() + "]");
		System.out.println("send_atic_nm = [" + getSend_atic_nm() + "]");
		System.out.println("sendclsf = [" + getSendclsf() + "]");
		System.out.println("serv_ref = [" + getServ_ref() + "]");
		System.out.println("cntc_plac = [" + getCntc_plac() + "]");
		System.out.println("send_fee = [" + getSend_fee() + "]");
		System.out.println("start_tm = [" + getStart_tm() + "]");
		System.out.println("end_tm = [" + getEnd_tm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("send_cmpy_cd = [" + getSend_cmpy_cd() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("scat_dt = [" + getScat_dt() + "]");
		System.out.println("bnch_qty = [" + getBnch_qty() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("bnch_qunt = [" + getBnch_qunt() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("purc_dlco_no = [" + getPurc_dlco_no() + "]");
		System.out.println("dstc_seqo = [" + getDstc_seqo() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("purc_reg_dt = [" + getPurc_reg_dt() + "]");
		System.out.println("purc_reg_seq = [" + getPurc_reg_seq() + "]");
		System.out.println("group_cnt = [" + getGroup_cnt() + "]");
		System.out.println("group_order = [" + getGroup_order() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
String send_dt = req.getParameter("send_dt");
if( send_dt == null){
	System.out.println(this.toString+" : send_dt is null" );
}else{
	System.out.println(this.toString+" : send_dt is "+send_dt );
}
String send_seq = req.getParameter("send_seq");
if( send_seq == null){
	System.out.println(this.toString+" : send_seq is null" );
}else{
	System.out.println(this.toString+" : send_seq is "+send_seq );
}
String send_atic_no = req.getParameter("send_atic_no");
if( send_atic_no == null){
	System.out.println(this.toString+" : send_atic_no is null" );
}else{
	System.out.println(this.toString+" : send_atic_no is "+send_atic_no );
}
String send_atic_nm = req.getParameter("send_atic_nm");
if( send_atic_nm == null){
	System.out.println(this.toString+" : send_atic_nm is null" );
}else{
	System.out.println(this.toString+" : send_atic_nm is "+send_atic_nm );
}
String sendclsf = req.getParameter("sendclsf");
if( sendclsf == null){
	System.out.println(this.toString+" : sendclsf is null" );
}else{
	System.out.println(this.toString+" : sendclsf is "+sendclsf );
}
String serv_ref = req.getParameter("serv_ref");
if( serv_ref == null){
	System.out.println(this.toString+" : serv_ref is null" );
}else{
	System.out.println(this.toString+" : serv_ref is "+serv_ref );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
String send_fee = req.getParameter("send_fee");
if( send_fee == null){
	System.out.println(this.toString+" : send_fee is null" );
}else{
	System.out.println(this.toString+" : send_fee is "+send_fee );
}
String start_tm = req.getParameter("start_tm");
if( start_tm == null){
	System.out.println(this.toString+" : start_tm is null" );
}else{
	System.out.println(this.toString+" : start_tm is "+start_tm );
}
String end_tm = req.getParameter("end_tm");
if( end_tm == null){
	System.out.println(this.toString+" : end_tm is null" );
}else{
	System.out.println(this.toString+" : end_tm is "+end_tm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String send_cmpy_cd = req.getParameter("send_cmpy_cd");
if( send_cmpy_cd == null){
	System.out.println(this.toString+" : send_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : send_cmpy_cd is "+send_cmpy_cd );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String scat_dt = req.getParameter("scat_dt");
if( scat_dt == null){
	System.out.println(this.toString+" : scat_dt is null" );
}else{
	System.out.println(this.toString+" : scat_dt is "+scat_dt );
}
String bnch_qty = req.getParameter("bnch_qty");
if( bnch_qty == null){
	System.out.println(this.toString+" : bnch_qty is null" );
}else{
	System.out.println(this.toString+" : bnch_qty is "+bnch_qty );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String bnch_qunt = req.getParameter("bnch_qunt");
if( bnch_qunt == null){
	System.out.println(this.toString+" : bnch_qunt is null" );
}else{
	System.out.println(this.toString+" : bnch_qunt is "+bnch_qunt );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String purc_dlco_no = req.getParameter("purc_dlco_no");
if( purc_dlco_no == null){
	System.out.println(this.toString+" : purc_dlco_no is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_no is "+purc_dlco_no );
}
String dstc_seqo = req.getParameter("dstc_seqo");
if( dstc_seqo == null){
	System.out.println(this.toString+" : dstc_seqo is null" );
}else{
	System.out.println(this.toString+" : dstc_seqo is "+dstc_seqo );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String acwr_reg_dt = req.getParameter("acwr_reg_dt");
if( acwr_reg_dt == null){
	System.out.println(this.toString+" : acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt is "+acwr_reg_dt );
}
String acwr_reg_seq = req.getParameter("acwr_reg_seq");
if( acwr_reg_seq == null){
	System.out.println(this.toString+" : acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq is "+acwr_reg_seq );
}
String purc_reg_dt = req.getParameter("purc_reg_dt");
if( purc_reg_dt == null){
	System.out.println(this.toString+" : purc_reg_dt is null" );
}else{
	System.out.println(this.toString+" : purc_reg_dt is "+purc_reg_dt );
}
String purc_reg_seq = req.getParameter("purc_reg_seq");
if( purc_reg_seq == null){
	System.out.println(this.toString+" : purc_reg_seq is null" );
}else{
	System.out.println(this.toString+" : purc_reg_seq is "+purc_reg_seq );
}
String group_cnt = req.getParameter("group_cnt");
if( group_cnt == null){
	System.out.println(this.toString+" : group_cnt is null" );
}else{
	System.out.println(this.toString+" : group_cnt is "+group_cnt );
}
String group_order = req.getParameter("group_order");
if( group_order == null){
	System.out.println(this.toString+" : group_order is null" );
}else{
	System.out.println(this.toString+" : group_order is "+group_order );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
String send_dt = Util.checkString(req.getParameter("send_dt"));
String send_seq = Util.checkString(req.getParameter("send_seq"));
String send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
String send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String serv_ref = Util.checkString(req.getParameter("serv_ref"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String send_fee = Util.checkString(req.getParameter("send_fee"));
String start_tm = Util.checkString(req.getParameter("start_tm"));
String end_tm = Util.checkString(req.getParameter("end_tm"));
String remk = Util.checkString(req.getParameter("remk"));
String send_cmpy_cd = Util.checkString(req.getParameter("send_cmpy_cd"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String scat_dt = Util.checkString(req.getParameter("scat_dt"));
String bnch_qty = Util.checkString(req.getParameter("bnch_qty"));
String qunt = Util.checkString(req.getParameter("qunt"));
String bnch_qunt = Util.checkString(req.getParameter("bnch_qunt"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
String dstc_seqo = Util.checkString(req.getParameter("dstc_seqo"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String purc_reg_dt = Util.checkString(req.getParameter("purc_reg_dt"));
String purc_reg_seq = Util.checkString(req.getParameter("purc_reg_seq"));
String group_cnt = Util.checkString(req.getParameter("group_cnt"));
String group_order = Util.checkString(req.getParameter("group_order"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String send_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_dt")));
String send_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_seq")));
String send_atic_no = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_no")));
String send_atic_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_nm")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String serv_ref = Util.Uni2Ksc(Util.checkString(req.getParameter("serv_ref")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String send_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("send_fee")));
String start_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm")));
String end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_tm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String send_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("send_cmpy_cd")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String scat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt")));
String bnch_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("bnch_qty")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String bnch_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("bnch_qunt")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String purc_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_no")));
String dstc_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("dstc_seqo")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String purc_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_reg_dt")));
String purc_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_reg_seq")));
String group_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("group_cnt")));
String group_order = Util.Uni2Ksc(Util.checkString(req.getParameter("group_order")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setWh_cd(wh_cd);
dm.setSend_dt(send_dt);
dm.setSend_seq(send_seq);
dm.setSend_atic_no(send_atic_no);
dm.setSend_atic_nm(send_atic_nm);
dm.setSendclsf(sendclsf);
dm.setServ_ref(serv_ref);
dm.setCntc_plac(cntc_plac);
dm.setSend_fee(send_fee);
dm.setStart_tm(start_tm);
dm.setEnd_tm(end_tm);
dm.setRemk(remk);
dm.setSend_cmpy_cd(send_cmpy_cd);
dm.setAdvcs_cd(advcs_cd);
dm.setStd_cd(std_cd);
dm.setScat_dt(scat_dt);
dm.setBnch_qty(bnch_qty);
dm.setQunt(qunt);
dm.setBnch_qunt(bnch_qunt);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setPurc_dlco_no(purc_dlco_no);
dm.setDstc_seqo(dstc_seqo);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setPurc_reg_dt(purc_reg_dt);
dm.setPurc_reg_seq(purc_reg_seq);
dm.setGroup_cnt(group_cnt);
dm.setGroup_order(group_order);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 29 14:13:03 KST 2012 */