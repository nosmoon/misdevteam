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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1304_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String hsty_dlco_ern;

	public AS_ASET_1304_LDM(){}
	public AS_ASET_1304_LDM(String hsty_dlco_ern){
		this.hsty_dlco_ern = hsty_dlco_ern;
	}

	public void setHsty_dlco_ern(String hsty_dlco_ern){
		this.hsty_dlco_ern = hsty_dlco_ern;
	}

	public String getHsty_dlco_ern(){
		return this.hsty_dlco_ern;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1304_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1304_LDM dm = (AS_ASET_1304_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.hsty_dlco_ern);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1304_LDataSet();
	}



    public void print(){
        System.out.println("hsty_dlco_ern = " + getHsty_dlco_ern());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String hsty_dlco_ern = req.getParameter("hsty_dlco_ern");
if( hsty_dlco_ern == null){
	System.out.println(this.toString+" : hsty_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hsty_dlco_ern is "+hsty_dlco_ern );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String hsty_dlco_ern = Util.checkString(req.getParameter("hsty_dlco_ern"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String hsty_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_dlco_ern")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setHsty_dlco_ern(hsty_dlco_ern);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 16:05:14 KST 2009 */