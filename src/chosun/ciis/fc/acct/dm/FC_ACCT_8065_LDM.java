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


public class FC_ACCT_8065_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String inwoncnt;
	public String totcnt;
	public String totamt;
	public String sdstotamt;
	public String jmstotamt;
	public String wctotamt;
	public String soaegcnt;
	public String soaegamt;

	public FC_ACCT_8065_LDM(){}
	public FC_ACCT_8065_LDM(String cmpy_cd, String inwoncnt, String totcnt, String totamt, String sdstotamt, String jmstotamt, String wctotamt, String soaegcnt, String soaegamt){
		this.cmpy_cd = cmpy_cd;
		this.inwoncnt = inwoncnt;
		this.totcnt = totcnt;
		this.totamt = totamt;
		this.sdstotamt = sdstotamt;
		this.jmstotamt = jmstotamt;
		this.wctotamt = wctotamt;
		this.soaegcnt = soaegcnt;
		this.soaegamt = soaegamt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public void setTotcnt(String totcnt){
		this.totcnt = totcnt;
	}

	public void setTotamt(String totamt){
		this.totamt = totamt;
	}

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setWctotamt(String wctotamt){
		this.wctotamt = wctotamt;
	}

	public void setSoaegcnt(String soaegcnt){
		this.soaegcnt = soaegcnt;
	}

	public void setSoaegamt(String soaegamt){
		this.soaegamt = soaegamt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}

	public String getTotcnt(){
		return this.totcnt;
	}

	public String getTotamt(){
		return this.totamt;
	}

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getWctotamt(){
		return this.wctotamt;
	}

	public String getSoaegcnt(){
		return this.soaegcnt;
	}

	public String getSoaegamt(){
		return this.soaegamt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_8065_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_8065_LDM dm = (FC_ACCT_8065_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.inwoncnt);
		cstmt.setString(5, dm.totcnt);
		cstmt.setString(6, dm.totamt);
		cstmt.setString(7, dm.sdstotamt);
		cstmt.setString(8, dm.jmstotamt);
		cstmt.setString(9, dm.wctotamt);
		cstmt.setString(10, dm.soaegcnt);
		cstmt.setString(11, dm.soaegamt);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_8065_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("inwoncnt = [" + getInwoncnt() + "]");
		System.out.println("totcnt = [" + getTotcnt() + "]");
		System.out.println("totamt = [" + getTotamt() + "]");
		System.out.println("sdstotamt = [" + getSdstotamt() + "]");
		System.out.println("jmstotamt = [" + getJmstotamt() + "]");
		System.out.println("wctotamt = [" + getWctotamt() + "]");
		System.out.println("soaegcnt = [" + getSoaegcnt() + "]");
		System.out.println("soaegamt = [" + getSoaegamt() + "]");
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
String inwoncnt = req.getParameter("inwoncnt");
if( inwoncnt == null){
	System.out.println(this.toString+" : inwoncnt is null" );
}else{
	System.out.println(this.toString+" : inwoncnt is "+inwoncnt );
}
String totcnt = req.getParameter("totcnt");
if( totcnt == null){
	System.out.println(this.toString+" : totcnt is null" );
}else{
	System.out.println(this.toString+" : totcnt is "+totcnt );
}
String totamt = req.getParameter("totamt");
if( totamt == null){
	System.out.println(this.toString+" : totamt is null" );
}else{
	System.out.println(this.toString+" : totamt is "+totamt );
}
String sdstotamt = req.getParameter("sdstotamt");
if( sdstotamt == null){
	System.out.println(this.toString+" : sdstotamt is null" );
}else{
	System.out.println(this.toString+" : sdstotamt is "+sdstotamt );
}
String jmstotamt = req.getParameter("jmstotamt");
if( jmstotamt == null){
	System.out.println(this.toString+" : jmstotamt is null" );
}else{
	System.out.println(this.toString+" : jmstotamt is "+jmstotamt );
}
String wctotamt = req.getParameter("wctotamt");
if( wctotamt == null){
	System.out.println(this.toString+" : wctotamt is null" );
}else{
	System.out.println(this.toString+" : wctotamt is "+wctotamt );
}
String soaegcnt = req.getParameter("soaegcnt");
if( soaegcnt == null){
	System.out.println(this.toString+" : soaegcnt is null" );
}else{
	System.out.println(this.toString+" : soaegcnt is "+soaegcnt );
}
String soaegamt = req.getParameter("soaegamt");
if( soaegamt == null){
	System.out.println(this.toString+" : soaegamt is null" );
}else{
	System.out.println(this.toString+" : soaegamt is "+soaegamt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String inwoncnt = Util.checkString(req.getParameter("inwoncnt"));
String totcnt = Util.checkString(req.getParameter("totcnt"));
String totamt = Util.checkString(req.getParameter("totamt"));
String sdstotamt = Util.checkString(req.getParameter("sdstotamt"));
String jmstotamt = Util.checkString(req.getParameter("jmstotamt"));
String wctotamt = Util.checkString(req.getParameter("wctotamt"));
String soaegcnt = Util.checkString(req.getParameter("soaegcnt"));
String soaegamt = Util.checkString(req.getParameter("soaegamt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String inwoncnt = Util.Uni2Ksc(Util.checkString(req.getParameter("inwoncnt")));
String totcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("totcnt")));
String totamt = Util.Uni2Ksc(Util.checkString(req.getParameter("totamt")));
String sdstotamt = Util.Uni2Ksc(Util.checkString(req.getParameter("sdstotamt")));
String jmstotamt = Util.Uni2Ksc(Util.checkString(req.getParameter("jmstotamt")));
String wctotamt = Util.Uni2Ksc(Util.checkString(req.getParameter("wctotamt")));
String soaegcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("soaegcnt")));
String soaegamt = Util.Uni2Ksc(Util.checkString(req.getParameter("soaegamt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInwoncnt(inwoncnt);
dm.setTotcnt(totcnt);
dm.setTotamt(totamt);
dm.setSdstotamt(sdstotamt);
dm.setJmstotamt(jmstotamt);
dm.setWctotamt(wctotamt);
dm.setSoaegcnt(soaegcnt);
dm.setSoaegamt(soaegamt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 16:21:33 KST 2009 */