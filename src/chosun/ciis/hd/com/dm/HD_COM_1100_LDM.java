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


package chosun.ciis.hd.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.com.ds.*;
import chosun.ciis.hd.com.rec.*;

/**
 * 
 */


public class HD_COM_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_tag;
	public String dept_cd;
	public String abrv_nm;

	public HD_COM_1100_LDM(){}
	public HD_COM_1100_LDM(String cmpy_cd, String search_tag, String dept_cd, String abrv_nm){
		this.cmpy_cd = cmpy_cd;
		this.search_tag = search_tag;
		this.dept_cd = dept_cd;
		this.abrv_nm = abrv_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_tag(String search_tag){
		this.search_tag = search_tag;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_tag(){
		return this.search_tag;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COM_1100_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COM_1100_LDM dm = (HD_COM_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_tag);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.abrv_nm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.com.ds.HD_COM_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_tag = [" + getSearch_tag() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("abrv_nm = [" + getAbrv_nm() + "]");
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
String search_tag = req.getParameter("search_tag");
if( search_tag == null){
	System.out.println(this.toString+" : search_tag is null" );
}else{
	System.out.println(this.toString+" : search_tag is "+search_tag );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String abrv_nm = req.getParameter("abrv_nm");
if( abrv_nm == null){
	System.out.println(this.toString+" : abrv_nm is null" );
}else{
	System.out.println(this.toString+" : abrv_nm is "+abrv_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_tag = Util.checkString(req.getParameter("search_tag"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("search_tag")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("abrv_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_tag(search_tag);
dm.setDept_cd(dept_cd);
dm.setAbrv_nm(abrv_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 28 14:20:15 KST 2009 */