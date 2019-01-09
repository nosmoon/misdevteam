/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_3310_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_emp_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_3310_MDataSet(){}
	public HD_VACA_3310_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_VACA_3310_MXX_EMP_CLSF_LISTRecord rec = new HD_VACA_3310_MXX_EMP_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_emp_clsf_list.add(rec);
			System.out.println("multiUpdateData=>"+ rec.cd_nm );
		}
		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_3310_MDataSet ds = (HD_VACA_3310_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.xx_emp_clsf_list.size(); i++){
		HD_VACA_3310_MXX_EMP_CLSF_LISTRecord xx_emp_clsf_listRec = (HD_VACA_3310_MXX_EMP_CLSF_LISTRecord)ds.xx_emp_clsf_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_clsf_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= xx_emp_clsf_listRec.cd_nm%>
<%= xx_emp_clsf_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 30 10:21:42 KST 2015 */