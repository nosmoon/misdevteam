/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2017-01-05
* 작성자 : 민 기 홍
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


public class SE_BOI_3030_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;
	public String incmg_pers;
	public String rmk;

	public SE_BOI_3030_UDM(){}
	public SE_BOI_3030_UDM(String seq, String incmg_pers, String rmk){
		this.seq = seq;
		this.incmg_pers = incmg_pers;
		this.rmk = rmk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setRmk(String rmk){
		this.rmk = rmk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getRmk(){
		return this.rmk;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_3030_U( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_3030_UDM dm = (SE_BOI_3030_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.rmk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_3030_UDataSet();
	}



    public void print(){
        System.out.println("seq = " + getSeq());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("rmk = " + getRmk());
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String rmk = req.getParameter("rmk");
if( rmk == null){
	System.out.println(this.toString+" : rmk is null" );
}else{
	System.out.println(this.toString+" : rmk is "+rmk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String rmk = Util.checkString(req.getParameter("rmk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String rmk = Util.Uni2Ksc(Util.checkString(req.getParameter("rmk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSeq(seq);
dm.setIncmg_pers(incmg_pers);
dm.setRmk(rmk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 03 13:47:47 KST 2017 */