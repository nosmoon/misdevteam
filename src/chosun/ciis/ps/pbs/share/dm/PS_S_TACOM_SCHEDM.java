/***************************************************************************************************
* 파일명 : PS_L_TACOM_SCHEDM.java
* 기능 : 출판국 일정 상세
* 작성일자 : 2004-02-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판국 일정 상세
 *
 */


public class PS_S_TACOM_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public String cmpycd;

	public PS_S_TACOM_SCHEDM(){}
	public PS_S_TACOM_SCHEDM(long seq, String cmpycd){
		this.seq = seq;
		this.cmpycd = cmpycd;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_TACOM_SCHE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_TACOM_SCHEDM dm = (PS_S_TACOM_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setString(4, dm.cmpycd);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_S_TACOM_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String seq = Util.checkString(req.getParameter("seq"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 20:33:12 KST 2004 */