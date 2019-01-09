/***************************************************************************************************
* 파일명 : SE_BOI_1093_LDM.java
* 기능 : 센터정보관리-센터대표정보-센터대표사진 다운로드 하기위한 조회
* 작성일자 : 2017-05-16
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 *
 */


public class SE_BOI_1093_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bo_cd;
	public String bo_head_prn;

	public SE_BOI_1093_LDM(){}
	public SE_BOI_1093_LDM(String bo_cd, String bo_head_prn){
		this.bo_cd = bo_cd;
		this.bo_head_prn = bo_head_prn;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1093_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1093_LDM dm = (SE_BOI_1093_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bo_cd);
		cstmt.setString(4, dm.bo_head_prn);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1093_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_head_prn = [" + getBo_head_prn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_head_prn = req.getParameter("bo_head_prn");
if( bo_head_prn == null){
	System.out.println(this.toString+" : bo_head_prn is null" );
}else{
	System.out.println(this.toString+" : bo_head_prn is "+bo_head_prn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_head_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_prn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBo_cd(bo_cd);
dm.setBo_head_prn(bo_head_prn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 16 09:40:04 KST 2017 */