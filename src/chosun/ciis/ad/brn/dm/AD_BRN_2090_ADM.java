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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_2090_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public String rept_no;
	public String add_file_no;

	public AD_BRN_2090_ADM(){}
	public AD_BRN_2090_ADM(String cmpy_cd, String rept_clsf, String make_dt, String rept_no, String add_file_no){
		this.cmpy_cd = cmpy_cd;
		this.rept_clsf = rept_clsf;
		this.make_dt = make_dt;
		this.rept_no = rept_no;
		this.add_file_no = add_file_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setAdd_file_no(String add_file_no){
		this.add_file_no = add_file_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getAdd_file_no(){
		return this.add_file_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_2090_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_2090_ADM dm = (AD_BRN_2090_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_clsf);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.rept_no);
		cstmt.setString(7, dm.add_file_no);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_2090_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_clsf = [" + getRept_clsf() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("add_file_no = [" + getAdd_file_no() + "]");
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
String rept_clsf = req.getParameter("rept_clsf");
if( rept_clsf == null){
	System.out.println(this.toString+" : rept_clsf is null" );
}else{
	System.out.println(this.toString+" : rept_clsf is "+rept_clsf );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String add_file_no = req.getParameter("add_file_no");
if( add_file_no == null){
	System.out.println(this.toString+" : add_file_no is null" );
}else{
	System.out.println(this.toString+" : add_file_no is "+add_file_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String add_file_no = Util.checkString(req.getParameter("add_file_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String add_file_no = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMake_dt(make_dt);
dm.setRept_no(rept_no);
dm.setAdd_file_no(add_file_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 21:33:27 KST 2009 */