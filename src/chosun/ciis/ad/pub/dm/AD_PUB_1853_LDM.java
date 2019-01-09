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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1853_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String select_dt;
	public String fr_dt;
	public String to_dt;
	public String misu;
	public String jikgulae;
	public String sale_clsf;
	public String acct_cd;
	public String emp_no;
	public String rslt_dept;
	public String medialeb_yn;
	public String chcode;

	public AD_PUB_1853_LDM(){}
	public AD_PUB_1853_LDM(String cmpy_cd, String medi_cd, String select_dt, String fr_dt, String to_dt, String misu, String jikgulae, String sale_clsf, String acct_cd, String emp_no, String rslt_dept, String medialeb_yn, String chcode){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.select_dt = select_dt;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.misu = misu;
		this.jikgulae = jikgulae;
		this.sale_clsf = sale_clsf;
		this.acct_cd = acct_cd;
		this.emp_no = emp_no;
		this.rslt_dept = rslt_dept;
		this.medialeb_yn = medialeb_yn;
		this.chcode = chcode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setMisu(String misu){
		this.misu = misu;
	}

	public void setJikgulae(String jikgulae){
		this.jikgulae = jikgulae;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}

	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getMisu(){
		return this.misu;
	}

	public String getJikgulae(){
		return this.jikgulae;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getRslt_dept(){
		return this.rslt_dept;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1853_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1853_LDM dm = (AD_PUB_1853_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.select_dt);
		cstmt.setString(6, dm.fr_dt);
		cstmt.setString(7, dm.to_dt);
		cstmt.setString(8, dm.misu);
		cstmt.setString(9, dm.jikgulae);
		cstmt.setString(10, dm.sale_clsf);
		cstmt.setString(11, dm.acct_cd);
		cstmt.setString(12, dm.emp_no);
		cstmt.setString(13, dm.rslt_dept);
		cstmt.setString(14, dm.medialeb_yn);
		cstmt.setString(15, dm.chcode);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1853_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("misu = [" + getMisu() + "]");
		System.out.println("jikgulae = [" + getJikgulae() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("rslt_dept = [" + getRslt_dept() + "]");
		System.out.println("medialeb_yn = [" + getMedialeb_yn() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String misu = req.getParameter("misu");
if( misu == null){
	System.out.println(this.toString+" : misu is null" );
}else{
	System.out.println(this.toString+" : misu is "+misu );
}
String jikgulae = req.getParameter("jikgulae");
if( jikgulae == null){
	System.out.println(this.toString+" : jikgulae is null" );
}else{
	System.out.println(this.toString+" : jikgulae is "+jikgulae );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String rslt_dept = req.getParameter("rslt_dept");
if( rslt_dept == null){
	System.out.println(this.toString+" : rslt_dept is null" );
}else{
	System.out.println(this.toString+" : rslt_dept is "+rslt_dept );
}
String medialeb_yn = req.getParameter("medialeb_yn");
if( medialeb_yn == null){
	System.out.println(this.toString+" : medialeb_yn is null" );
}else{
	System.out.println(this.toString+" : medialeb_yn is "+medialeb_yn );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String misu = Util.checkString(req.getParameter("misu"));
String jikgulae = Util.checkString(req.getParameter("jikgulae"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String rslt_dept = Util.checkString(req.getParameter("rslt_dept"));
String medialeb_yn = Util.checkString(req.getParameter("medialeb_yn"));
String chcode = Util.checkString(req.getParameter("chcode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String misu = Util.Uni2Ksc(Util.checkString(req.getParameter("misu")));
String jikgulae = Util.Uni2Ksc(Util.checkString(req.getParameter("jikgulae")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String rslt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_dept")));
String medialeb_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("medialeb_yn")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSelect_dt(select_dt);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setMisu(misu);
dm.setJikgulae(jikgulae);
dm.setSale_clsf(sale_clsf);
dm.setAcct_cd(acct_cd);
dm.setEmp_no(emp_no);
dm.setRslt_dept(rslt_dept);
dm.setMedialeb_yn(medialeb_yn);
dm.setChcode(chcode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 14:39:53 KST 2015 */