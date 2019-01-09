/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.eis.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.eis.rec.AD_EIS_1210_LCURLISTRecord;

/**
 * 
 */


public class AD_EIS_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EIS_1210_LDataSet(){}
	public AD_EIS_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_EIS_1210_LCURLISTRecord rec = new AD_EIS_1210_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.issu_side = Util.checkString(rset0.getString("issu_side"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.c_0100_amt = Util.checkString(rset0.getString("c_0100_amt"));
			rec.c_0200_amt = Util.checkString(rset0.getString("c_0200_amt"));
			rec.c_0301_amt = Util.checkString(rset0.getString("c_0301_amt"));
			rec.c_0302_amt = Util.checkString(rset0.getString("c_0302_amt"));
			rec.c_0303_amt = Util.checkString(rset0.getString("c_0303_amt"));
			rec.c_0304_amt = Util.checkString(rset0.getString("c_0304_amt"));
			rec.c_0305_amt = Util.checkString(rset0.getString("c_0305_amt"));
			rec.c_0306_amt = Util.checkString(rset0.getString("c_0306_amt"));
			rec.c_0307_amt = Util.checkString(rset0.getString("c_0307_amt"));
			rec.c_0308_amt = Util.checkString(rset0.getString("c_0308_amt"));
			rec.c_0309_amt = Util.checkString(rset0.getString("c_0309_amt"));
			rec.c_0310_amt = Util.checkString(rset0.getString("c_0310_amt"));
			rec.c_0401_amt = Util.checkString(rset0.getString("c_0401_amt"));
			rec.c_0402_amt = Util.checkString(rset0.getString("c_0402_amt"));
			rec.c_0403_amt = Util.checkString(rset0.getString("c_0403_amt"));
			rec.c_0404_amt = Util.checkString(rset0.getString("c_0404_amt"));
			rec.c_0405_amt = Util.checkString(rset0.getString("c_0405_amt"));
			rec.c_0406_amt = Util.checkString(rset0.getString("c_0406_amt"));
			rec.c_0407_amt = Util.checkString(rset0.getString("c_0407_amt"));
			rec.c_0408_amt = Util.checkString(rset0.getString("c_0408_amt"));
			rec.c_0409_amt = Util.checkString(rset0.getString("c_0409_amt"));
			rec.c_0410_amt = Util.checkString(rset0.getString("c_0410_amt"));
			rec.c_0501_amt = Util.checkString(rset0.getString("c_0501_amt"));
			rec.c_0502_amt = Util.checkString(rset0.getString("c_0502_amt"));
			rec.c_0503_amt = Util.checkString(rset0.getString("c_0503_amt"));
			rec.c_0504_amt = Util.checkString(rset0.getString("c_0504_amt"));
			rec.c_0505_amt = Util.checkString(rset0.getString("c_0505_amt"));
			rec.c_0506_amt = Util.checkString(rset0.getString("c_0506_amt"));
			rec.c_0507_amt = Util.checkString(rset0.getString("c_0507_amt"));
			rec.c_0508_amt = Util.checkString(rset0.getString("c_0508_amt"));
			rec.c_0509_amt = Util.checkString(rset0.getString("c_0509_amt"));
			rec.c_0510_amt = Util.checkString(rset0.getString("c_0510_amt"));
			rec.c_0601_amt = Util.checkString(rset0.getString("c_0601_amt"));
			rec.c_0602_amt = Util.checkString(rset0.getString("c_0602_amt"));
			rec.c_0603_amt = Util.checkString(rset0.getString("c_0603_amt"));
			rec.c_0604_amt = Util.checkString(rset0.getString("c_0604_amt"));
			rec.c_0605_amt = Util.checkString(rset0.getString("c_0605_amt"));
			rec.c_0606_amt = Util.checkString(rset0.getString("c_0606_amt"));
			rec.c_0607_amt = Util.checkString(rset0.getString("c_0607_amt"));
			rec.c_0608_amt = Util.checkString(rset0.getString("c_0608_amt"));
			rec.c_0609_amt = Util.checkString(rset0.getString("c_0609_amt"));
			rec.c_0610_amt = Util.checkString(rset0.getString("c_0610_amt"));
			rec.c_0611_amt = Util.checkString(rset0.getString("c_0611_amt"));
			rec.c_0612_amt = Util.checkString(rset0.getString("c_0612_amt"));
			rec.c_0613_amt = Util.checkString(rset0.getString("c_0613_amt"));
			rec.c_0614_amt = Util.checkString(rset0.getString("c_0614_amt"));
			rec.c_0615_amt = Util.checkString(rset0.getString("c_0615_amt"));
			rec.c_0616_amt = Util.checkString(rset0.getString("c_0616_amt"));
			rec.c_0617_amt = Util.checkString(rset0.getString("c_0617_amt"));
			rec.c_0621_amt = Util.checkString(rset0.getString("c_0621_amt"));
			rec.c_0631_amt = Util.checkString(rset0.getString("c_0631_amt"));
			rec.c_0632_amt = Util.checkString(rset0.getString("c_0632_amt"));
			rec.c_0701_amt = Util.checkString(rset0.getString("c_0701_amt"));
			rec.c_0702_amt = Util.checkString(rset0.getString("c_0702_amt"));
			rec.c_0703_amt = Util.checkString(rset0.getString("c_0703_amt"));
			rec.c_0704_amt = Util.checkString(rset0.getString("c_0704_amt"));
			rec.c_0705_amt = Util.checkString(rset0.getString("c_0705_amt"));
			rec.c_0706_amt = Util.checkString(rset0.getString("c_0706_amt"));
			rec.c_0707_amt = Util.checkString(rset0.getString("c_0707_amt"));
			rec.c_0708_amt = Util.checkString(rset0.getString("c_0708_amt"));
			rec.c_0709_amt = Util.checkString(rset0.getString("c_0709_amt"));
			rec.c_0710_amt = Util.checkString(rset0.getString("c_0710_amt"));
			rec.c_0711_amt = Util.checkString(rset0.getString("c_0711_amt"));
			rec.c_0712_amt = Util.checkString(rset0.getString("c_0712_amt"));
			rec.c_0100_pcnt = Util.checkString(rset0.getString("c_0100_pcnt"));
			rec.c_0200_pcnt = Util.checkString(rset0.getString("c_0200_pcnt"));
			rec.c_0301_pcnt = Util.checkString(rset0.getString("c_0301_pcnt"));
			rec.c_0302_pcnt = Util.checkString(rset0.getString("c_0302_pcnt"));
			rec.c_0303_pcnt = Util.checkString(rset0.getString("c_0303_pcnt"));
			rec.c_0304_pcnt = Util.checkString(rset0.getString("c_0304_pcnt"));
			rec.c_0305_pcnt = Util.checkString(rset0.getString("c_0305_pcnt"));
			rec.c_0306_pcnt = Util.checkString(rset0.getString("c_0306_pcnt"));
			rec.c_0307_pcnt = Util.checkString(rset0.getString("c_0307_pcnt"));
			rec.c_0308_pcnt = Util.checkString(rset0.getString("c_0308_pcnt"));
			rec.c_0309_pcnt = Util.checkString(rset0.getString("c_0309_pcnt"));
			rec.c_0310_pcnt = Util.checkString(rset0.getString("c_0310_pcnt"));
			rec.c_0401_pcnt = Util.checkString(rset0.getString("c_0401_pcnt"));
			rec.c_0402_pcnt = Util.checkString(rset0.getString("c_0402_pcnt"));
			rec.c_0403_pcnt = Util.checkString(rset0.getString("c_0403_pcnt"));
			rec.c_0404_pcnt = Util.checkString(rset0.getString("c_0404_pcnt"));
			rec.c_0405_pcnt = Util.checkString(rset0.getString("c_0405_pcnt"));
			rec.c_0406_pcnt = Util.checkString(rset0.getString("c_0406_pcnt"));
			rec.c_0407_pcnt = Util.checkString(rset0.getString("c_0407_pcnt"));
			rec.c_0408_pcnt = Util.checkString(rset0.getString("c_0408_pcnt"));
			rec.c_0409_pcnt = Util.checkString(rset0.getString("c_0409_pcnt"));
			rec.c_0410_pcnt = Util.checkString(rset0.getString("c_0410_pcnt"));
			rec.c_0501_pcnt = Util.checkString(rset0.getString("c_0501_pcnt"));
			rec.c_0502_pcnt = Util.checkString(rset0.getString("c_0502_pcnt"));
			rec.c_0503_pcnt = Util.checkString(rset0.getString("c_0503_pcnt"));
			rec.c_0504_pcnt = Util.checkString(rset0.getString("c_0504_pcnt"));
			rec.c_0505_pcnt = Util.checkString(rset0.getString("c_0505_pcnt"));
			rec.c_0506_pcnt = Util.checkString(rset0.getString("c_0506_pcnt"));
			rec.c_0507_pcnt = Util.checkString(rset0.getString("c_0507_pcnt"));
			rec.c_0508_pcnt = Util.checkString(rset0.getString("c_0508_pcnt"));
			rec.c_0509_pcnt = Util.checkString(rset0.getString("c_0509_pcnt"));
			rec.c_0510_pcnt = Util.checkString(rset0.getString("c_0510_pcnt"));
			rec.c_0601_pcnt = Util.checkString(rset0.getString("c_0601_pcnt"));
			rec.c_0602_pcnt = Util.checkString(rset0.getString("c_0602_pcnt"));
			rec.c_0603_pcnt = Util.checkString(rset0.getString("c_0603_pcnt"));
			rec.c_0604_pcnt = Util.checkString(rset0.getString("c_0604_pcnt"));
			rec.c_0605_pcnt = Util.checkString(rset0.getString("c_0605_pcnt"));
			rec.c_0606_pcnt = Util.checkString(rset0.getString("c_0606_pcnt"));
			rec.c_0607_pcnt = Util.checkString(rset0.getString("c_0607_pcnt"));
			rec.c_0608_pcnt = Util.checkString(rset0.getString("c_0608_pcnt"));
			rec.c_0609_pcnt = Util.checkString(rset0.getString("c_0609_pcnt"));
			rec.c_0610_pcnt = Util.checkString(rset0.getString("c_0610_pcnt"));
			rec.c_0611_pcnt = Util.checkString(rset0.getString("c_0611_pcnt"));
			rec.c_0612_pcnt = Util.checkString(rset0.getString("c_0612_pcnt"));
			rec.c_0613_pcnt = Util.checkString(rset0.getString("c_0613_pcnt"));
			rec.c_0614_pcnt = Util.checkString(rset0.getString("c_0614_pcnt"));
			rec.c_0615_pcnt = Util.checkString(rset0.getString("c_0615_pcnt"));
			rec.c_0616_pcnt = Util.checkString(rset0.getString("c_0616_pcnt"));
			rec.c_0617_pcnt = Util.checkString(rset0.getString("c_0617_pcnt"));
			rec.c_0621_pcnt = Util.checkString(rset0.getString("c_0621_pcnt"));
			rec.c_0631_pcnt = Util.checkString(rset0.getString("c_0631_pcnt"));
			rec.c_0632_pcnt = Util.checkString(rset0.getString("c_0632_pcnt"));
			rec.c_0701_pcnt = Util.checkString(rset0.getString("c_0701_pcnt"));
			rec.c_0702_pcnt = Util.checkString(rset0.getString("c_0702_pcnt"));
			rec.c_0703_pcnt = Util.checkString(rset0.getString("c_0703_pcnt"));
			rec.c_0704_pcnt = Util.checkString(rset0.getString("c_0704_pcnt"));
			rec.c_0705_pcnt = Util.checkString(rset0.getString("c_0705_pcnt"));
			rec.c_0706_pcnt = Util.checkString(rset0.getString("c_0706_pcnt"));
			rec.c_0707_pcnt = Util.checkString(rset0.getString("c_0707_pcnt"));
			rec.c_0708_pcnt = Util.checkString(rset0.getString("c_0708_pcnt"));
			rec.c_0709_pcnt = Util.checkString(rset0.getString("c_0709_pcnt"));
			rec.c_0710_pcnt = Util.checkString(rset0.getString("c_0710_pcnt"));
			rec.c_0711_pcnt = Util.checkString(rset0.getString("c_0711_pcnt"));
			rec.c_0712_pcnt = Util.checkString(rset0.getString("c_0712_pcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EIS_1210_LDataSet ds = (AD_EIS_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EIS_1210_LCURLISTRecord curlistRec = (AD_EIS_1210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pubc_dt%>
<%= curlistRec.issu_side%>
<%= curlistRec.advt_fee%>
<%= curlistRec.c_0100_amt%>
<%= curlistRec.c_0200_amt%>
<%= curlistRec.c_0301_amt%>
<%= curlistRec.c_0302_amt%>
<%= curlistRec.c_0303_amt%>
<%= curlistRec.c_0304_amt%>
<%= curlistRec.c_0305_amt%>
<%= curlistRec.c_0306_amt%>
<%= curlistRec.c_0307_amt%>
<%= curlistRec.c_0308_amt%>
<%= curlistRec.c_0309_amt%>
<%= curlistRec.c_0310_amt%>
<%= curlistRec.c_0401_amt%>
<%= curlistRec.c_0402_amt%>
<%= curlistRec.c_0403_amt%>
<%= curlistRec.c_0404_amt%>
<%= curlistRec.c_0405_amt%>
<%= curlistRec.c_0406_amt%>
<%= curlistRec.c_0407_amt%>
<%= curlistRec.c_0408_amt%>
<%= curlistRec.c_0409_amt%>
<%= curlistRec.c_0410_amt%>
<%= curlistRec.c_0501_amt%>
<%= curlistRec.c_0502_amt%>
<%= curlistRec.c_0503_amt%>
<%= curlistRec.c_0504_amt%>
<%= curlistRec.c_0505_amt%>
<%= curlistRec.c_0506_amt%>
<%= curlistRec.c_0507_amt%>
<%= curlistRec.c_0508_amt%>
<%= curlistRec.c_0509_amt%>
<%= curlistRec.c_0510_amt%>
<%= curlistRec.c_0601_amt%>
<%= curlistRec.c_0602_amt%>
<%= curlistRec.c_0603_amt%>
<%= curlistRec.c_0604_amt%>
<%= curlistRec.c_0605_amt%>
<%= curlistRec.c_0606_amt%>
<%= curlistRec.c_0607_amt%>
<%= curlistRec.c_0608_amt%>
<%= curlistRec.c_0609_amt%>
<%= curlistRec.c_0610_amt%>
<%= curlistRec.c_0611_amt%>
<%= curlistRec.c_0612_amt%>
<%= curlistRec.c_0613_amt%>
<%= curlistRec.c_0614_amt%>
<%= curlistRec.c_0615_amt%>
<%= curlistRec.c_0616_amt%>
<%= curlistRec.c_0617_amt%>
<%= curlistRec.c_0621_amt%>
<%= curlistRec.c_0631_amt%>
<%= curlistRec.c_0632_amt%>
<%= curlistRec.c_0701_amt%>
<%= curlistRec.c_0702_amt%>
<%= curlistRec.c_0703_amt%>
<%= curlistRec.c_0704_amt%>
<%= curlistRec.c_0705_amt%>
<%= curlistRec.c_0706_amt%>
<%= curlistRec.c_0707_amt%>
<%= curlistRec.c_0708_amt%>
<%= curlistRec.c_0709_amt%>
<%= curlistRec.c_0710_amt%>
<%= curlistRec.c_0711_amt%>
<%= curlistRec.c_0712_amt%>
<%= curlistRec.c_0100_pcnt%>
<%= curlistRec.c_0200_pcnt%>
<%= curlistRec.c_0301_pcnt%>
<%= curlistRec.c_0302_pcnt%>
<%= curlistRec.c_0303_pcnt%>
<%= curlistRec.c_0304_pcnt%>
<%= curlistRec.c_0305_pcnt%>
<%= curlistRec.c_0306_pcnt%>
<%= curlistRec.c_0307_pcnt%>
<%= curlistRec.c_0308_pcnt%>
<%= curlistRec.c_0309_pcnt%>
<%= curlistRec.c_0310_pcnt%>
<%= curlistRec.c_0401_pcnt%>
<%= curlistRec.c_0402_pcnt%>
<%= curlistRec.c_0403_pcnt%>
<%= curlistRec.c_0404_pcnt%>
<%= curlistRec.c_0405_pcnt%>
<%= curlistRec.c_0406_pcnt%>
<%= curlistRec.c_0407_pcnt%>
<%= curlistRec.c_0408_pcnt%>
<%= curlistRec.c_0409_pcnt%>
<%= curlistRec.c_0410_pcnt%>
<%= curlistRec.c_0501_pcnt%>
<%= curlistRec.c_0502_pcnt%>
<%= curlistRec.c_0503_pcnt%>
<%= curlistRec.c_0504_pcnt%>
<%= curlistRec.c_0505_pcnt%>
<%= curlistRec.c_0506_pcnt%>
<%= curlistRec.c_0507_pcnt%>
<%= curlistRec.c_0508_pcnt%>
<%= curlistRec.c_0509_pcnt%>
<%= curlistRec.c_0510_pcnt%>
<%= curlistRec.c_0601_pcnt%>
<%= curlistRec.c_0602_pcnt%>
<%= curlistRec.c_0603_pcnt%>
<%= curlistRec.c_0604_pcnt%>
<%= curlistRec.c_0605_pcnt%>
<%= curlistRec.c_0606_pcnt%>
<%= curlistRec.c_0607_pcnt%>
<%= curlistRec.c_0608_pcnt%>
<%= curlistRec.c_0609_pcnt%>
<%= curlistRec.c_0610_pcnt%>
<%= curlistRec.c_0611_pcnt%>
<%= curlistRec.c_0612_pcnt%>
<%= curlistRec.c_0613_pcnt%>
<%= curlistRec.c_0614_pcnt%>
<%= curlistRec.c_0615_pcnt%>
<%= curlistRec.c_0616_pcnt%>
<%= curlistRec.c_0617_pcnt%>
<%= curlistRec.c_0621_pcnt%>
<%= curlistRec.c_0631_pcnt%>
<%= curlistRec.c_0632_pcnt%>
<%= curlistRec.c_0701_pcnt%>
<%= curlistRec.c_0702_pcnt%>
<%= curlistRec.c_0703_pcnt%>
<%= curlistRec.c_0704_pcnt%>
<%= curlistRec.c_0705_pcnt%>
<%= curlistRec.c_0706_pcnt%>
<%= curlistRec.c_0707_pcnt%>
<%= curlistRec.c_0708_pcnt%>
<%= curlistRec.c_0709_pcnt%>
<%= curlistRec.c_0710_pcnt%>
<%= curlistRec.c_0711_pcnt%>
<%= curlistRec.c_0712_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 10:56:54 KST 2009 */