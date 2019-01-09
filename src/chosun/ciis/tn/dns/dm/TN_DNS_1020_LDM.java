/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String memberidx;
	public String membercode;

	public TN_DNS_1020_LDM(){}
	public TN_DNS_1020_LDM(String cmpy_cd, String memberidx, String membercode){
		this.cmpy_cd = cmpy_cd;
		this.memberidx = memberidx;
		this.membercode = membercode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1020_LDM dm = (TN_DNS_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.memberidx);
		cstmt.setString(5, dm.membercode);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("membercode = [" + getMembercode() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String membercode = req.getParameter("membercode");
if( membercode == null){
	System.out.println(this.toString+" : membercode is null" );
}else{
	System.out.println(this.toString+" : membercode is "+membercode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String membercode = Util.checkString(req.getParameter("membercode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String membercode = Util.Uni2Ksc(Util.checkString(req.getParameter("membercode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMemberidx(memberidx);
dm.setMembercode(membercode);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 12 18:09:25 KST 2016 */