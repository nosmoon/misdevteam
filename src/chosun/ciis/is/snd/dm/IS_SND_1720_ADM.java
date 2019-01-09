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


public class IS_SND_1720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String wh_cd;
	public String send_dt;
	public String spc_matt_1;
	public String spc_matt_2;
	public String mode;
	public String send_seq;
	public String send_atic_no;
	public String send_atic_nm;
	public String sendclsf;
	public String serv_ref;
	public String cntc_plac;
	public String send_fee;
	public String start_tm;
	public String end_tm;
	public String send_path;
	public String send_advt_cont;
	public String send_qunt;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SND_1720_ADM(){}
	public IS_SND_1720_ADM(String flag, String cmpy_cd, String wh_cd, String send_dt, String spc_matt_1, String spc_matt_2, String mode, String send_seq, String send_atic_no, String send_atic_nm, String sendclsf, String serv_ref, String cntc_plac, String send_fee, String start_tm, String end_tm, String send_path, String send_advt_cont, String send_qunt, String remk, String incmg_pers, String incmg_pers_ip){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.wh_cd = wh_cd;
		this.send_dt = send_dt;
		this.spc_matt_1 = spc_matt_1;
		this.spc_matt_2 = spc_matt_2;
		this.mode = mode;
		this.send_seq = send_seq;
		this.send_atic_no = send_atic_no;
		this.send_atic_nm = send_atic_nm;
		this.sendclsf = sendclsf;
		this.serv_ref = serv_ref;
		this.cntc_plac = cntc_plac;
		this.send_fee = send_fee;
		this.start_tm = start_tm;
		this.end_tm = end_tm;
		this.send_path = send_path;
		this.send_advt_cont = send_advt_cont;
		this.send_qunt = send_qunt;
		this.remk = remk;
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

	public void setSpc_matt_1(String spc_matt_1){
		this.spc_matt_1 = spc_matt_1;
	}

	public void setSpc_matt_2(String spc_matt_2){
		this.spc_matt_2 = spc_matt_2;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setSend_path(String send_path){
		this.send_path = send_path;
	}

	public void setSend_advt_cont(String send_advt_cont){
		this.send_advt_cont = send_advt_cont;
	}

	public void setSend_qunt(String send_qunt){
		this.send_qunt = send_qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getSpc_matt_1(){
		return this.spc_matt_1;
	}

	public String getSpc_matt_2(){
		return this.spc_matt_2;
	}

	public String getMode(){
		return this.mode;
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

	public String getSend_path(){
		return this.send_path;
	}

	public String getSend_advt_cont(){
		return this.send_advt_cont;
	}

	public String getSend_qunt(){
		return this.send_qunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1720_ADM dm = (IS_SND_1720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.wh_cd);
		cstmt.setString(6, dm.send_dt);
		cstmt.setString(7, dm.spc_matt_1);
		cstmt.setString(8, dm.spc_matt_2);
		cstmt.setString(9, dm.mode);
		cstmt.setString(10, dm.send_seq);
		cstmt.setString(11, dm.send_atic_no);
		cstmt.setString(12, dm.send_atic_nm);
		cstmt.setString(13, dm.sendclsf);
		cstmt.setString(14, dm.serv_ref);
		cstmt.setString(15, dm.cntc_plac);
		cstmt.setString(16, dm.send_fee);
		cstmt.setString(17, dm.start_tm);
		cstmt.setString(18, dm.end_tm);
		cstmt.setString(19, dm.send_path);
		cstmt.setString(20, dm.send_advt_cont);
		cstmt.setString(21, dm.send_qunt);
		cstmt.setString(22, dm.remk);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.incmg_pers_ip);
		cstmt.registerOutParameter(25, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("send_dt = [" + getSend_dt() + "]");
		System.out.println("spc_matt_1 = [" + getSpc_matt_1() + "]");
		System.out.println("spc_matt_2 = [" + getSpc_matt_2() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("send_seq = [" + getSend_seq() + "]");
		System.out.println("send_atic_no = [" + getSend_atic_no() + "]");
		System.out.println("send_atic_nm = [" + getSend_atic_nm() + "]");
		System.out.println("sendclsf = [" + getSendclsf() + "]");
		System.out.println("serv_ref = [" + getServ_ref() + "]");
		System.out.println("cntc_plac = [" + getCntc_plac() + "]");
		System.out.println("send_fee = [" + getSend_fee() + "]");
		System.out.println("start_tm = [" + getStart_tm() + "]");
		System.out.println("end_tm = [" + getEnd_tm() + "]");
		System.out.println("send_path = [" + getSend_path() + "]");
		System.out.println("send_advt_cont = [" + getSend_advt_cont() + "]");
		System.out.println("send_qunt = [" + getSend_qunt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String spc_matt_1 = req.getParameter("spc_matt_1");
if( spc_matt_1 == null){
	System.out.println(this.toString+" : spc_matt_1 is null" );
}else{
	System.out.println(this.toString+" : spc_matt_1 is "+spc_matt_1 );
}
String spc_matt_2 = req.getParameter("spc_matt_2");
if( spc_matt_2 == null){
	System.out.println(this.toString+" : spc_matt_2 is null" );
}else{
	System.out.println(this.toString+" : spc_matt_2 is "+spc_matt_2 );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String send_path = req.getParameter("send_path");
if( send_path == null){
	System.out.println(this.toString+" : send_path is null" );
}else{
	System.out.println(this.toString+" : send_path is "+send_path );
}
String send_advt_cont = req.getParameter("send_advt_cont");
if( send_advt_cont == null){
	System.out.println(this.toString+" : send_advt_cont is null" );
}else{
	System.out.println(this.toString+" : send_advt_cont is "+send_advt_cont );
}
String send_qunt = req.getParameter("send_qunt");
if( send_qunt == null){
	System.out.println(this.toString+" : send_qunt is null" );
}else{
	System.out.println(this.toString+" : send_qunt is "+send_qunt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String spc_matt_1 = Util.checkString(req.getParameter("spc_matt_1"));
String spc_matt_2 = Util.checkString(req.getParameter("spc_matt_2"));
String mode = Util.checkString(req.getParameter("mode"));
String send_seq = Util.checkString(req.getParameter("send_seq"));
String send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
String send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String serv_ref = Util.checkString(req.getParameter("serv_ref"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String send_fee = Util.checkString(req.getParameter("send_fee"));
String start_tm = Util.checkString(req.getParameter("start_tm"));
String end_tm = Util.checkString(req.getParameter("end_tm"));
String send_path = Util.checkString(req.getParameter("send_path"));
String send_advt_cont = Util.checkString(req.getParameter("send_advt_cont"));
String send_qunt = Util.checkString(req.getParameter("send_qunt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String send_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_dt")));
String spc_matt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_matt_1")));
String spc_matt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_matt_2")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String send_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_seq")));
String send_atic_no = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_no")));
String send_atic_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_nm")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String serv_ref = Util.Uni2Ksc(Util.checkString(req.getParameter("serv_ref")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String send_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("send_fee")));
String start_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm")));
String end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_tm")));
String send_path = Util.Uni2Ksc(Util.checkString(req.getParameter("send_path")));
String send_advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("send_advt_cont")));
String send_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_qunt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setWh_cd(wh_cd);
dm.setSend_dt(send_dt);
dm.setSpc_matt_1(spc_matt_1);
dm.setSpc_matt_2(spc_matt_2);
dm.setMode(mode);
dm.setSend_seq(send_seq);
dm.setSend_atic_no(send_atic_no);
dm.setSend_atic_nm(send_atic_nm);
dm.setSendclsf(sendclsf);
dm.setServ_ref(serv_ref);
dm.setCntc_plac(cntc_plac);
dm.setSend_fee(send_fee);
dm.setStart_tm(start_tm);
dm.setEnd_tm(end_tm);
dm.setSend_path(send_path);
dm.setSend_advt_cont(send_advt_cont);
dm.setSend_qunt(send_qunt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 08 14:45:39 KST 2013 */