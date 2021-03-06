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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String sell_mm;
	public String incmg_pers_ip;
	public String incmg_dept_cd;
	public String incmg_pers;
	public String seq_l;

	public AD_NMD_1040_ADM(){}
	public AD_NMD_1040_ADM(String cmpy_cd, String occr_dt, String sell_mm, String incmg_pers_ip, String incmg_dept_cd, String incmg_pers, String seq_l){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.sell_mm = sell_mm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers = incmg_pers;
		this.seq_l = seq_l;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSell_mm(String sell_mm){
		this.sell_mm = sell_mm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSeq_l(String seq_l){
		this.seq_l = seq_l;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSell_mm(){
		return this.sell_mm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSeq_l(){
		return this.seq_l;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_1040_ADM dm = (AD_NMD_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.sell_mm);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.incmg_dept_cd);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.seq_l);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("sell_mm = [" + getSell_mm() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("seq_l = [" + getSeq_l() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String sell_mm = req.getParameter("sell_mm");
if( sell_mm == null){
	System.out.println(this.toString+" : sell_mm is null" );
}else{
	System.out.println(this.toString+" : sell_mm is "+sell_mm );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String seq_l = req.getParameter("seq_l");
if( seq_l == null){
	System.out.println(this.toString+" : seq_l is null" );
}else{
	System.out.println(this.toString+" : seq_l is "+seq_l );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String sell_mm = Util.checkString(req.getParameter("sell_mm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String seq_l = Util.checkString(req.getParameter("seq_l"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String sell_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_mm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String seq_l = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_l")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSell_mm(sell_mm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setSeq_l(seq_l);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 26 17:19:26 KST 2012 */