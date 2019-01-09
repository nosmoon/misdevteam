/***************************************************************************************************
* 파일명 : PS_U_INFOEXG_RECOMDM.java
* 기능 : 출판국 일정 추천
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
 * 출판국 일정 추천
 *
 */


public class PS_U_INFOEXG_RECOMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public long recomcnt;

	public PS_U_INFOEXG_RECOMDM(){}
	public PS_U_INFOEXG_RECOMDM(String clsf, long seq, long recomcnt){
		this.clsf = clsf;
		this.seq = seq;
		this.recomcnt = recomcnt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setRecomcnt(long recomcnt){
		this.recomcnt = recomcnt;
	}

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public long getRecomcnt(){
		return this.recomcnt;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_INFOEXG_RECOM( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_INFOEXG_RECOMDM dm = (PS_U_INFOEXG_RECOMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setLong(5, dm.recomcnt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_U_INFOEXG_RECOMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String recomcnt = req.getParameter("recomcnt");
if( recomcnt == null){
	System.out.println(this.toString+" : recomcnt is null" );
}else{
	System.out.println(this.toString+" : recomcnt is "+recomcnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String recomcnt = Util.checkString(req.getParameter("recomcnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String recomcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("recomcnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setRecomcnt(recomcnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 20:38:34 KST 2004 */