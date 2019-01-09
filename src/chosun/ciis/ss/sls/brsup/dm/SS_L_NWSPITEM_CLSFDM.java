/***************************************************************************************************
* 파일명 : SS_L_NWSPITEM_CLSFDM.java
* 기능 : 지국지원-신문지원물품-물품목록을 위한 DM
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-물품목록을 위한 DM
 */

public class SS_L_NWSPITEM_CLSFDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemclsf;

	public SS_L_NWSPITEM_CLSFDM(){}
	public SS_L_NWSPITEM_CLSFDM(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NWSPITEM_CLSF( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWSPITEM_CLSFDM dm = (SS_L_NWSPITEM_CLSFDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemclsf);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_NWSPITEM_CLSFDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.checkString(req.getParameter("itemclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setItemclsf(itemclsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 20:45:07 KST 2004 */