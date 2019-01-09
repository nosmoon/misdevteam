/***************************************************************************************************
* 파일명 : SS_D_OUTRPTDM.java
* 기능 : 정보공유 출장보고서 삭제
* 작성일자 : 2003-12-24
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_D_OUTRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;

	public SS_D_OUTRPTDM(){}
	public SS_D_OUTRPTDM(String makedt, String makepersid){
		this.makedt = makedt;
		this.makepersid = makepersid;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_OUTRPT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_OUTRPTDM dm = (SS_D_OUTRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_D_OUTRPTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 24 15:16:04 KST 2003 */