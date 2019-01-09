/***************************************************************************************************
* ���ϸ� : SS_SLS_BRSUP_2920_SDM.java
* ��� : ��������-������Ȳ-�������-�������������-��(�˾�)
* �ۼ����� : 2016-08-11
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *
 */


public class SS_SLS_BRSUP_2920_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String stafclsfcd;
	public String stafno;
	public String clsfdtls;
	public String stmm;
	public String edmm;

	public SS_SLS_BRSUP_2920_SDM(){}
	public SS_SLS_BRSUP_2920_SDM(String stafclsfcd, String stafno, String clsfdtls, String stmm, String edmm){
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.clsfdtls = clsfdtls;
		this.stmm = stmm;
		this.edmm = edmm;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setClsfdtls(String clsfdtls){
		this.clsfdtls = clsfdtls;
	}

	public void setStmm(String stmm){
		this.stmm = stmm;
	}

	public void setEdmm(String edmm){
		this.edmm = edmm;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getClsfdtls(){
		return this.clsfdtls;
	}

	public String getStmm(){
		return this.stmm;
	}

	public String getEdmm(){
		return this.edmm;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_BRSUP_2920_S( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRSUP_2920_SDM dm = (SS_SLS_BRSUP_2920_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.stafclsfcd);
		cstmt.setString(4, dm.stafno);
		cstmt.setString(5, dm.clsfdtls);
		cstmt.setString(6, dm.stmm);
		cstmt.setString(7, dm.edmm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_SLS_BRSUP_2920_SDataSet();
	}



    public void print(){
        System.out.println("stafclsfcd = " + getStafclsfcd());
        System.out.println("stafno = " + getStafno());
        System.out.println("clsfdtls = " + getClsfdtls());
        System.out.println("stmm = " + getStmm());
        System.out.println("edmm = " + getEdmm());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String clsfdtls = req.getParameter("clsfdtls");
if( clsfdtls == null){
	System.out.println(this.toString+" : clsfdtls is null" );
}else{
	System.out.println(this.toString+" : clsfdtls is "+clsfdtls );
}
String stmm = req.getParameter("stmm");
if( stmm == null){
	System.out.println(this.toString+" : stmm is null" );
}else{
	System.out.println(this.toString+" : stmm is "+stmm );
}
String edmm = req.getParameter("edmm");
if( edmm == null){
	System.out.println(this.toString+" : edmm is null" );
}else{
	System.out.println(this.toString+" : edmm is "+edmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String clsfdtls = Util.checkString(req.getParameter("clsfdtls"));
String stmm = Util.checkString(req.getParameter("stmm"));
String edmm = Util.checkString(req.getParameter("edmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String clsfdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfdtls")));
String stmm = Util.Uni2Ksc(Util.checkString(req.getParameter("stmm")));
String edmm = Util.Uni2Ksc(Util.checkString(req.getParameter("edmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
dm.setClsfdtls(clsfdtls);
dm.setStmm(stmm);
dm.setEdmm(edmm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 11 10:44:09 KST 2016 */