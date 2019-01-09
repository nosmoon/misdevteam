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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6132_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_gb;
	public String fr_cymd;
	public String to_cymd;
	public String bugi_fr_cymd;
	public String bugi_to_cymd;
	public String bangi_fr_cymd;
	public String bangi_to_cymd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String erplace_cd;

	public FC_ACCT_6132_IDM(){}
	public FC_ACCT_6132_IDM(String cmpy_cd, String work_gb, String fr_cymd, String to_cymd, String bugi_fr_cymd, String bugi_to_cymd, String bangi_fr_cymd, String bangi_to_cymd, String incmg_pers_ipadd, String incmg_pers, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.work_gb = work_gb;
		this.fr_cymd = fr_cymd;
		this.to_cymd = to_cymd;
		this.bugi_fr_cymd = bugi_fr_cymd;
		this.bugi_to_cymd = bugi_to_cymd;
		this.bangi_fr_cymd = bangi_fr_cymd;
		this.bangi_to_cymd = bangi_to_cymd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_gb(String work_gb){
		this.work_gb = work_gb;
	}

	public void setFr_cymd(String fr_cymd){
		this.fr_cymd = fr_cymd;
	}

	public void setTo_cymd(String to_cymd){
		this.to_cymd = to_cymd;
	}

	public void setBugi_fr_cymd(String bugi_fr_cymd){
		this.bugi_fr_cymd = bugi_fr_cymd;
	}

	public void setBugi_to_cymd(String bugi_to_cymd){
		this.bugi_to_cymd = bugi_to_cymd;
	}

	public void setBangi_fr_cymd(String bangi_fr_cymd){
		this.bangi_fr_cymd = bangi_fr_cymd;
	}

	public void setBangi_to_cymd(String bangi_to_cymd){
		this.bangi_to_cymd = bangi_to_cymd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_gb(){
		return this.work_gb;
	}

	public String getFr_cymd(){
		return this.fr_cymd;
	}

	public String getTo_cymd(){
		return this.to_cymd;
	}

	public String getBugi_fr_cymd(){
		return this.bugi_fr_cymd;
	}

	public String getBugi_to_cymd(){
		return this.bugi_to_cymd;
	}

	public String getBangi_fr_cymd(){
		return this.bangi_fr_cymd;
	}

	public String getBangi_to_cymd(){
		return this.bangi_to_cymd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6132_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6132_IDM dm = (FC_ACCT_6132_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_gb);
		cstmt.setString(5, dm.fr_cymd);
		cstmt.setString(6, dm.to_cymd);
		cstmt.setString(7, dm.bugi_fr_cymd);
		cstmt.setString(8, dm.bugi_to_cymd);
		cstmt.setString(9, dm.bangi_fr_cymd);
		cstmt.setString(10, dm.bangi_to_cymd);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.erplace_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6132_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_gb = [" + getWork_gb() + "]");
		System.out.println("fr_cymd = [" + getFr_cymd() + "]");
		System.out.println("to_cymd = [" + getTo_cymd() + "]");
		System.out.println("bugi_fr_cymd = [" + getBugi_fr_cymd() + "]");
		System.out.println("bugi_to_cymd = [" + getBugi_to_cymd() + "]");
		System.out.println("bangi_fr_cymd = [" + getBangi_fr_cymd() + "]");
		System.out.println("bangi_to_cymd = [" + getBangi_to_cymd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
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
String work_gb = req.getParameter("work_gb");
if( work_gb == null){
	System.out.println(this.toString+" : work_gb is null" );
}else{
	System.out.println(this.toString+" : work_gb is "+work_gb );
}
String fr_cymd = req.getParameter("fr_cymd");
if( fr_cymd == null){
	System.out.println(this.toString+" : fr_cymd is null" );
}else{
	System.out.println(this.toString+" : fr_cymd is "+fr_cymd );
}
String to_cymd = req.getParameter("to_cymd");
if( to_cymd == null){
	System.out.println(this.toString+" : to_cymd is null" );
}else{
	System.out.println(this.toString+" : to_cymd is "+to_cymd );
}
String bugi_fr_cymd = req.getParameter("bugi_fr_cymd");
if( bugi_fr_cymd == null){
	System.out.println(this.toString+" : bugi_fr_cymd is null" );
}else{
	System.out.println(this.toString+" : bugi_fr_cymd is "+bugi_fr_cymd );
}
String bugi_to_cymd = req.getParameter("bugi_to_cymd");
if( bugi_to_cymd == null){
	System.out.println(this.toString+" : bugi_to_cymd is null" );
}else{
	System.out.println(this.toString+" : bugi_to_cymd is "+bugi_to_cymd );
}
String bangi_fr_cymd = req.getParameter("bangi_fr_cymd");
if( bangi_fr_cymd == null){
	System.out.println(this.toString+" : bangi_fr_cymd is null" );
}else{
	System.out.println(this.toString+" : bangi_fr_cymd is "+bangi_fr_cymd );
}
String bangi_to_cymd = req.getParameter("bangi_to_cymd");
if( bangi_to_cymd == null){
	System.out.println(this.toString+" : bangi_to_cymd is null" );
}else{
	System.out.println(this.toString+" : bangi_to_cymd is "+bangi_to_cymd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_gb = Util.checkString(req.getParameter("work_gb"));
String fr_cymd = Util.checkString(req.getParameter("fr_cymd"));
String to_cymd = Util.checkString(req.getParameter("to_cymd"));
String bugi_fr_cymd = Util.checkString(req.getParameter("bugi_fr_cymd"));
String bugi_to_cymd = Util.checkString(req.getParameter("bugi_to_cymd"));
String bangi_fr_cymd = Util.checkString(req.getParameter("bangi_fr_cymd"));
String bangi_to_cymd = Util.checkString(req.getParameter("bangi_to_cymd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("work_gb")));
String fr_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_cymd")));
String to_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_cymd")));
String bugi_fr_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("bugi_fr_cymd")));
String bugi_to_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("bugi_to_cymd")));
String bangi_fr_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("bangi_fr_cymd")));
String bangi_to_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("bangi_to_cymd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_gb(work_gb);
dm.setFr_cymd(fr_cymd);
dm.setTo_cymd(to_cymd);
dm.setBugi_fr_cymd(bugi_fr_cymd);
dm.setBugi_to_cymd(bugi_to_cymd);
dm.setBangi_fr_cymd(bangi_fr_cymd);
dm.setBangi_to_cymd(bangi_to_cymd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 20:10:12 KST 2009 */