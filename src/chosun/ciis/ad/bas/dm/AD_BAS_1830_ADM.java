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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1830_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_clsf;
	public String make_dt;
	public String dlco_no;
	public String diary_titl;
	public String make_pers;
	public String diary_cont;
	public String opn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_1830_ADM(){}
	public AD_BAS_1830_ADM(String flag, String cmpy_cd, String medi_clsf, String make_dt, String dlco_no, String diary_titl, String make_pers, String diary_cont, String opn, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.make_dt = make_dt;
		this.dlco_no = dlco_no;
		this.diary_titl = diary_titl;
		this.make_pers = make_pers;
		this.diary_cont = diary_cont;
		this.opn = opn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDiary_titl(String diary_titl){
		this.diary_titl = diary_titl;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setDiary_cont(String diary_cont){
		this.diary_cont = diary_cont;
	}

	public void setOpn(String opn){
		this.opn = opn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDiary_titl(){
		return this.diary_titl;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getDiary_cont(){
		return this.diary_cont;
	}

	public String getOpn(){
		return this.opn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1830_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1830_ADM dm = (AD_BAS_1830_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.make_dt);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.diary_titl);
		cstmt.setString(9, dm.make_pers);
		cstmt.setString(10, dm.diary_cont);
		cstmt.setString(11, dm.opn);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1830_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("diary_titl = [" + getDiary_titl() + "]");
		System.out.println("make_pers = [" + getMake_pers() + "]");
		System.out.println("diary_cont = [" + getDiary_cont() + "]");
		System.out.println("opn = [" + getOpn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String diary_titl = req.getParameter("diary_titl");
if( diary_titl == null){
	System.out.println(this.toString+" : diary_titl is null" );
}else{
	System.out.println(this.toString+" : diary_titl is "+diary_titl );
}
String make_pers = req.getParameter("make_pers");
if( make_pers == null){
	System.out.println(this.toString+" : make_pers is null" );
}else{
	System.out.println(this.toString+" : make_pers is "+make_pers );
}
String diary_cont = req.getParameter("diary_cont");
if( diary_cont == null){
	System.out.println(this.toString+" : diary_cont is null" );
}else{
	System.out.println(this.toString+" : diary_cont is "+diary_cont );
}
String opn = req.getParameter("opn");
if( opn == null){
	System.out.println(this.toString+" : opn is null" );
}else{
	System.out.println(this.toString+" : opn is "+opn );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String diary_titl = Util.checkString(req.getParameter("diary_titl"));
String make_pers = Util.checkString(req.getParameter("make_pers"));
String diary_cont = Util.checkString(req.getParameter("diary_cont"));
String opn = Util.checkString(req.getParameter("opn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String diary_titl = Util.Uni2Ksc(Util.checkString(req.getParameter("diary_titl")));
String make_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers")));
String diary_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("diary_cont")));
String opn = Util.Uni2Ksc(Util.checkString(req.getParameter("opn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setMake_dt(make_dt);
dm.setDlco_no(dlco_no);
dm.setDiary_titl(diary_titl);
dm.setMake_pers(make_pers);
dm.setDiary_cont(diary_cont);
dm.setOpn(opn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 18:12:06 KST 2009 */