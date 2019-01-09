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


package chosun.ciis.as.artmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.artmgr.ds.*;
import chosun.ciis.as.artmgr.rec.*;

/**
 * 
 */


public class AS_ARTMGR_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String art_prod_no;
	public String art_cate_nm;
	public String author;
	public String art_prod_nm;
	public String get_dt_fr;
	public String get_dt_to;
	public String dnt_clsf;

	public AS_ARTMGR_1002_LDM(){}
	public AS_ARTMGR_1002_LDM(String cmpy_cd, String art_prod_no, String art_cate_nm, String author, String art_prod_nm, String get_dt_fr, String get_dt_to, String dnt_clsf){
		this.cmpy_cd = cmpy_cd;
		this.art_prod_no = art_prod_no;
		this.art_cate_nm = art_cate_nm;
		this.author = author;
		this.art_prod_nm = art_prod_nm;
		this.get_dt_fr = get_dt_fr;
		this.get_dt_to = get_dt_to;
		this.dnt_clsf = dnt_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArt_prod_no(String art_prod_no){
		this.art_prod_no = art_prod_no;
	}

	public void setArt_cate_nm(String art_cate_nm){
		this.art_cate_nm = art_cate_nm;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setArt_prod_nm(String art_prod_nm){
		this.art_prod_nm = art_prod_nm;
	}

	public void setGet_dt_fr(String get_dt_fr){
		this.get_dt_fr = get_dt_fr;
	}

	public void setGet_dt_to(String get_dt_to){
		this.get_dt_to = get_dt_to;
	}

	public void setDnt_clsf(String dnt_clsf){
		this.dnt_clsf = dnt_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArt_prod_no(){
		return this.art_prod_no;
	}

	public String getArt_cate_nm(){
		return this.art_cate_nm;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getArt_prod_nm(){
		return this.art_prod_nm;
	}

	public String getGet_dt_fr(){
		return this.get_dt_fr;
	}

	public String getGet_dt_to(){
		return this.get_dt_to;
	}

	public String getDnt_clsf(){
		return this.dnt_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ARTMGR_1002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ARTMGR_1002_LDM dm = (AS_ARTMGR_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.art_prod_no);
		cstmt.setString(5, dm.art_cate_nm);
		cstmt.setString(6, dm.author);
		cstmt.setString(7, dm.art_prod_nm);
		cstmt.setString(8, dm.get_dt_fr);
		cstmt.setString(9, dm.get_dt_to);
		cstmt.setString(10, dm.dnt_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.artmgr.ds.AS_ARTMGR_1002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("art_prod_no = [" + getArt_prod_no() + "]");
		System.out.println("art_cate_nm = [" + getArt_cate_nm() + "]");
		System.out.println("author = [" + getAuthor() + "]");
		System.out.println("art_prod_nm = [" + getArt_prod_nm() + "]");
		System.out.println("get_dt_fr = [" + getGet_dt_fr() + "]");
		System.out.println("get_dt_to = [" + getGet_dt_to() + "]");
		System.out.println("dnt_clsf = [" + getDnt_clsf() + "]");
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
String art_prod_no = req.getParameter("art_prod_no");
if( art_prod_no == null){
	System.out.println(this.toString+" : art_prod_no is null" );
}else{
	System.out.println(this.toString+" : art_prod_no is "+art_prod_no );
}
String art_cate_nm = req.getParameter("art_cate_nm");
if( art_cate_nm == null){
	System.out.println(this.toString+" : art_cate_nm is null" );
}else{
	System.out.println(this.toString+" : art_cate_nm is "+art_cate_nm );
}
String author = req.getParameter("author");
if( author == null){
	System.out.println(this.toString+" : author is null" );
}else{
	System.out.println(this.toString+" : author is "+author );
}
String art_prod_nm = req.getParameter("art_prod_nm");
if( art_prod_nm == null){
	System.out.println(this.toString+" : art_prod_nm is null" );
}else{
	System.out.println(this.toString+" : art_prod_nm is "+art_prod_nm );
}
String get_dt_fr = req.getParameter("get_dt_fr");
if( get_dt_fr == null){
	System.out.println(this.toString+" : get_dt_fr is null" );
}else{
	System.out.println(this.toString+" : get_dt_fr is "+get_dt_fr );
}
String get_dt_to = req.getParameter("get_dt_to");
if( get_dt_to == null){
	System.out.println(this.toString+" : get_dt_to is null" );
}else{
	System.out.println(this.toString+" : get_dt_to is "+get_dt_to );
}
String dnt_clsf = req.getParameter("dnt_clsf");
if( dnt_clsf == null){
	System.out.println(this.toString+" : dnt_clsf is null" );
}else{
	System.out.println(this.toString+" : dnt_clsf is "+dnt_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String art_prod_no = Util.checkString(req.getParameter("art_prod_no"));
String art_cate_nm = Util.checkString(req.getParameter("art_cate_nm"));
String author = Util.checkString(req.getParameter("author"));
String art_prod_nm = Util.checkString(req.getParameter("art_prod_nm"));
String get_dt_fr = Util.checkString(req.getParameter("get_dt_fr"));
String get_dt_to = Util.checkString(req.getParameter("get_dt_to"));
String dnt_clsf = Util.checkString(req.getParameter("dnt_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String art_prod_no = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_no")));
String art_cate_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("art_cate_nm")));
String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));
String art_prod_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_nm")));
String get_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("get_dt_fr")));
String get_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("get_dt_to")));
String dnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dnt_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArt_prod_no(art_prod_no);
dm.setArt_cate_nm(art_cate_nm);
dm.setAuthor(author);
dm.setArt_prod_nm(art_prod_nm);
dm.setGet_dt_fr(get_dt_fr);
dm.setGet_dt_to(get_dt_to);
dm.setDnt_clsf(dnt_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 10:56:42 KST 2009 */