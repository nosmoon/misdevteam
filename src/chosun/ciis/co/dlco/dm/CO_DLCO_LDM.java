/***************************************************************************************************
* 파일명 : CO_DLCO_LDM.java
* 기능 : 공통-공통거래처
* 작성일자 : 2009-04-13
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sys_clsf_cd;
	public String search_tag;
	public String search_key;

	public CO_DLCO_LDM(){}
	public CO_DLCO_LDM(String sys_clsf_cd, String search_tag, String search_key){
		this.sys_clsf_cd = sys_clsf_cd;
		this.search_tag = search_tag;
		this.search_key = search_key;
	}

	public void setSys_clsf_cd(String sys_clsf_cd){
		this.sys_clsf_cd = sys_clsf_cd;
	}

	public void setSearch_tag(String search_tag){
		this.search_tag = search_tag;
	}

	public void setSearch_key(String search_key){
		this.search_key = search_key;
	}

	public String getSys_clsf_cd(){
		return this.sys_clsf_cd;
	}

	public String getSearch_tag(){
		return this.search_tag;
	}

	public String getSearch_key(){
		return this.search_key;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_DLCO_L( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_LDM dm = (CO_DLCO_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sys_clsf_cd);
		cstmt.setString(4, dm.search_tag);
		cstmt.setString(5, dm.search_key);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_LDataSet();
	}



    public void print(){
        System.out.println("sys_clsf_cd = " + getSys_clsf_cd());
        System.out.println("search_tag = " + getSearch_tag());
        System.out.println("search_key = " + getSearch_key());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String sys_clsf_cd = req.getParameter("sys_clsf_cd");
if( sys_clsf_cd == null){
	System.out.println(this.toString+" : sys_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sys_clsf_cd is "+sys_clsf_cd );
}
String search_tag = req.getParameter("search_tag");
if( search_tag == null){
	System.out.println(this.toString+" : search_tag is null" );
}else{
	System.out.println(this.toString+" : search_tag is "+search_tag );
}
String search_key = req.getParameter("search_key");
if( search_key == null){
	System.out.println(this.toString+" : search_key is null" );
}else{
	System.out.println(this.toString+" : search_key is "+search_key );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String sys_clsf_cd = Util.checkString(req.getParameter("sys_clsf_cd"));
String search_tag = Util.checkString(req.getParameter("search_tag"));
String search_key = Util.checkString(req.getParameter("search_key"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String sys_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sys_clsf_cd")));
String search_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("search_tag")));
String search_key = Util.Uni2Ksc(Util.checkString(req.getParameter("search_key")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSys_clsf_cd(sys_clsf_cd);
dm.setSearch_tag(search_tag);
dm.setSearch_key(search_key);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 24 11:35:58 KST 2009 */