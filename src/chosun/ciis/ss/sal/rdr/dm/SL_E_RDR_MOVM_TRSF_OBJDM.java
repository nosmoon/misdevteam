/***************************************************************************************************
* ���ϸ� : SL_E_RDR_MOVM_TRSF_OBJDataSet.java
* ��� : ���ұ�����������-�ΰ�-����� �߰��� ���� ������ ���ڼ��� ���Ѵ�.
* �ۼ����� : 2004-02-06
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/



package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ���ұ�����������-�ΰ�-����� �߰��� ���� ������ ���ڼ��� ���Ѵ�.
 *
 */


public class SL_E_RDR_MOVM_TRSF_OBJDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String dstccd;
	public String bgndlvno;
	public String enddlvno;

	public SL_E_RDR_MOVM_TRSF_OBJDM(){}
	public SL_E_RDR_MOVM_TRSF_OBJDM(String bocd, String dstccd, String bgndlvno, String enddlvno){
		this.bocd = bocd;
		this.dstccd = dstccd;
		this.bgndlvno = bgndlvno;
		this.enddlvno = enddlvno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}

	public String getSQL(){
		 return "{ call SP_SL_E_RDR_MOVM_TRSF_OBJ( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_E_RDR_MOVM_TRSF_OBJDM dm = (SL_E_RDR_MOVM_TRSF_OBJDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.dstccd);
		cstmt.setString(5, dm.bgndlvno);
		cstmt.setString(6, dm.enddlvno);
		cstmt.registerOutParameter(7, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_E_RDR_MOVM_TRSF_OBJDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String dstccd = req.getParameter("dstccd");
if( dstccd == null){
	System.out.println(this.toString+" : dstccd is null" );
}else{
	System.out.println(this.toString+" : dstccd is "+dstccd );
}
String bgndlvno = req.getParameter("bgndlvno");
if( bgndlvno == null){
	System.out.println(this.toString+" : bgndlvno is null" );
}else{
	System.out.println(this.toString+" : bgndlvno is "+bgndlvno );
}
String enddlvno = req.getParameter("enddlvno");
if( enddlvno == null){
	System.out.println(this.toString+" : enddlvno is null" );
}else{
	System.out.println(this.toString+" : enddlvno is "+enddlvno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String dstccd = Util.checkString(req.getParameter("dstccd"));
String bgndlvno = Util.checkString(req.getParameter("bgndlvno"));
String enddlvno = Util.checkString(req.getParameter("enddlvno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String dstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstccd")));
String bgndlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("bgndlvno")));
String enddlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("enddlvno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setDstccd(dstccd);
dm.setBgndlvno(bgndlvno);
dm.setEnddlvno(enddlvno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 06 10:55:17 KST 2004 */