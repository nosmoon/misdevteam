/***************************************************************************************************
* 파일명 : SE_BNS_1140_LDM.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1140_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bns_item_cd;

	public SE_BNS_1140_LDM(){}
	public SE_BNS_1140_LDM(String cmpy_cd, String bns_item_cd){
		this.cmpy_cd = cmpy_cd;
		this.bns_item_cd = bns_item_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1140_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1140_LDM dm = (SE_BNS_1140_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bns_item_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1140_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bns_item_cd = " + getBns_item_cd());
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
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBns_item_cd(bns_item_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 11:14:41 KST 2009 */