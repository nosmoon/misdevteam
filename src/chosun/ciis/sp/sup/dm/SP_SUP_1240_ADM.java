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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1240_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String send_clsf;
	public String snd_date;
	public String sms_content;
	public String sms_callback;
	public String rv_acwr_rmsg_ptph;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SUP_1240_ADM(){}
	public SP_SUP_1240_ADM(String cmpy_cd, String send_clsf, String snd_date, String sms_content, String sms_callback, String rv_acwr_rmsg_ptph, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.send_clsf = send_clsf;
		this.snd_date = snd_date;
		this.sms_content = sms_content;
		this.sms_callback = sms_callback;
		this.rv_acwr_rmsg_ptph = rv_acwr_rmsg_ptph;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSend_clsf(String send_clsf){
		this.send_clsf = send_clsf;
	}

	public void setSnd_date(String snd_date){
		this.snd_date = snd_date;
	}

	public void setSms_content(String sms_content){
		this.sms_content = sms_content;
	}

	public void setSms_callback(String sms_callback){
		this.sms_callback = sms_callback;
	}

	public void setRv_acwr_rmsg_ptph(String rv_acwr_rmsg_ptph){
		this.rv_acwr_rmsg_ptph = rv_acwr_rmsg_ptph;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSend_clsf(){
		return this.send_clsf;
	}

	public String getSnd_date(){
		return this.snd_date;
	}

	public String getSms_content(){
		return this.sms_content;
	}

	public String getSms_callback(){
		return this.sms_callback;
	}

	public String getRv_acwr_rmsg_ptph(){
		return this.rv_acwr_rmsg_ptph;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1240_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1240_ADM dm = (SP_SUP_1240_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.send_clsf);
		cstmt.setString(5, dm.snd_date);
		cstmt.setString(6, dm.sms_content);
		cstmt.setString(7, dm.sms_callback);
		cstmt.setString(8, dm.rv_acwr_rmsg_ptph);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1240_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("send_clsf = [" + getSend_clsf() + "]");
		System.out.println("snd_date = [" + getSnd_date() + "]");
		System.out.println("sms_content = [" + getSms_content() + "]");
		System.out.println("sms_callback = [" + getSms_callback() + "]");
		System.out.println("rv_acwr_rmsg_ptph = [" + getRv_acwr_rmsg_ptph() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String send_clsf = req.getParameter("send_clsf");
if( send_clsf == null){
	System.out.println(this.toString+" : send_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clsf is "+send_clsf );
}
String snd_date = req.getParameter("snd_date");
if( snd_date == null){
	System.out.println(this.toString+" : snd_date is null" );
}else{
	System.out.println(this.toString+" : snd_date is "+snd_date );
}
String sms_content = req.getParameter("sms_content");
if( sms_content == null){
	System.out.println(this.toString+" : sms_content is null" );
}else{
	System.out.println(this.toString+" : sms_content is "+sms_content );
}
String sms_callback = req.getParameter("sms_callback");
if( sms_callback == null){
	System.out.println(this.toString+" : sms_callback is null" );
}else{
	System.out.println(this.toString+" : sms_callback is "+sms_callback );
}
String rv_acwr_rmsg_ptph = req.getParameter("rv_acwr_rmsg_ptph");
if( rv_acwr_rmsg_ptph == null){
	System.out.println(this.toString+" : rv_acwr_rmsg_ptph is null" );
}else{
	System.out.println(this.toString+" : rv_acwr_rmsg_ptph is "+rv_acwr_rmsg_ptph );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String send_clsf = Util.checkString(req.getParameter("send_clsf"));
String snd_date = Util.checkString(req.getParameter("snd_date"));
String sms_content = Util.checkString(req.getParameter("sms_content"));
String sms_callback = Util.checkString(req.getParameter("sms_callback"));
String rv_acwr_rmsg_ptph = Util.checkString(req.getParameter("rv_acwr_rmsg_ptph"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String send_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clsf")));
String snd_date = Util.Uni2Ksc(Util.checkString(req.getParameter("snd_date")));
String sms_content = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_content")));
String sms_callback = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_callback")));
String rv_acwr_rmsg_ptph = Util.Uni2Ksc(Util.checkString(req.getParameter("rv_acwr_rmsg_ptph")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSend_clsf(send_clsf);
dm.setSnd_date(snd_date);
dm.setSms_content(sms_content);
dm.setSms_callback(sms_callback);
dm.setRv_acwr_rmsg_ptph(rv_acwr_rmsg_ptph);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 20 21:59:57 KST 2012 */