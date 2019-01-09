/***************************************************************************************************
* 파일명 : SS_L_MO_SVYLISTDM.java
* 기능 :  마감년월, 캠페인유형으로 문자설문리스트를 가져온다.
* 작성일자 : 2016.02.29
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *
 */


public class SS_L_MO_SVYLISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String basicdt;
	public String camptype;

	public SS_L_MO_SVYLISTDM(){}
	public SS_L_MO_SVYLISTDM(String frdt, String todt, String basicdt, String camptype){
		this.frdt = frdt;
		this.todt = todt;
		this.basicdt = basicdt;
		this.camptype = camptype;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBasicdt(String basicdt){
		this.basicdt = basicdt;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBasicdt(){
		return this.basicdt;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MO_SVYLIST( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MO_SVYLISTDM dm = (SS_L_MO_SVYLISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.basicdt);
		cstmt.setString(6, dm.camptype);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_MO_SVYLISTDataSet();
	}



    public void print(){
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("basicdt = " + getBasicdt());
        System.out.println("camptype = " + getCamptype());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String basicdt = req.getParameter("basicdt");
if( basicdt == null){
	System.out.println(this.toString+" : basicdt is null" );
}else{
	System.out.println(this.toString+" : basicdt is "+basicdt );
}
String camptype = req.getParameter("camptype");
if( camptype == null){
	System.out.println(this.toString+" : camptype is null" );
}else{
	System.out.println(this.toString+" : camptype is "+camptype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String basicdt = Util.checkString(req.getParameter("basicdt"));
String camptype = Util.checkString(req.getParameter("camptype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String basicdt = Util.Uni2Ksc(Util.checkString(req.getParameter("basicdt")));
String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setBasicdt(basicdt);
dm.setCamptype(camptype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 29 18:14:36 KST 2016 */