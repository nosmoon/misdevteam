/***************************************************************************************************
* ���ϸ� : CO_A_RUNLOG.java
* ��� : ����-���೻������
* �ۼ����� : 2005-10-11
* �ۼ��� : �����
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 *����-���೻������
 */


public class CO_A_RUNLOGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String objnm;
	public String seq;
	public String status;

	public CO_A_RUNLOGDM(){}
	public CO_A_RUNLOGDM(String accflag, String bocd, String objnm, String seq, String status){
		this.accflag = accflag;
		this.bocd = bocd;
		this.objnm = objnm;
		this.seq = seq;
		this.status = status;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setObjnm(String objnm){
		this.objnm = objnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getObjnm(){
		return this.objnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getStatus(){
		return this.status;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_RUNLOG( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_RUNLOGDM dm = (CO_A_RUNLOGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.objnm);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.status);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.CO_A_RUNLOGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String objnm = req.getParameter("objnm");
if( objnm == null){
	System.out.println(this.toString+" : objnm is null" );
}else{
	System.out.println(this.toString+" : objnm is "+objnm );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String status = req.getParameter("status");
if( status == null){
	System.out.println(this.toString+" : status is null" );
}else{
	System.out.println(this.toString+" : status is "+status );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String objnm = Util.checkString(req.getParameter("objnm"));
String seq = Util.checkString(req.getParameter("seq"));
String status = Util.checkString(req.getParameter("status"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String objnm = Util.Uni2Ksc(Util.checkString(req.getParameter("objnm")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String status = Util.Uni2Ksc(Util.checkString(req.getParameter("status")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setObjnm(objnm);
dm.setSeq(seq);
dm.setStatus(status);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Oct 11 20:44:14 KST 2005 */