/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 승인취소처리
* 작성일자 : 2009-05-19
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 입주아파트관리 승인취소처리
 */

public class SS_U_EXTN_APT_CANCELDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String aptcd;

	public SS_U_EXTN_APT_CANCELDM(){}
	public SS_U_EXTN_APT_CANCELDM(String uid, String aptcd){
		this.uid = uid;
		this.aptcd = aptcd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setAptcd(String aptcd){
		this.aptcd = aptcd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getAptcd(){
		return this.aptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EXTN_APT_CANCEL( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EXTN_APT_CANCELDM dm = (SS_U_EXTN_APT_CANCELDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.aptcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_EXTN_APT_CANCELDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String aptcd = req.getParameter("aptcd");
if( aptcd == null){
	System.out.println(this.toString+" : aptcd is null" );
}else{
	System.out.println(this.toString+" : aptcd is "+aptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String aptcd = Util.checkString(req.getParameter("aptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String aptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setAptcd(aptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 16:29:26 KST 2009 */