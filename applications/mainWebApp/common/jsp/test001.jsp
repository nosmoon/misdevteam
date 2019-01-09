<%@ page contentType="text/html; charset=KSC5601"%>
<!DOCTYPE html>
<html>
<head>
<title>test</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%--@include file="/css/dev/angular.css"%>
<%@include file="/js/dev/angular.js"--%>

<!-- GRID -->
<link rel="stylesheet" href="http://ui-grid.info/release/ui-grid.css" type="text/css">
<!-- COMMON -->
<style>
select, input, button { width:100px; }
input { background-color:#eded99; border:1px solid #999999; text-align:center; }
span.label1 { font-weight:600; color:#ff0000; margin:0 auto; padding:0; height:25px; }
h1.title { font-size:30px; font-weight:600; padding-left:10px; }

.ui-grid-menu-button {
    height: 23px !important;
}

.datagrid {
	width: 100%;
	height: 500px;
	border:1px solid #999999;
	padding-bottom:1px;	
	font-family: Arial, 굴림체;
	font-size: 12px;
}

.btn1 {
	border:1px solid #999999;
	border-radius: 3px;
	line-height:1.2;
	padding-top:2px;
	cursor:pointer;
}
.btn1:hover {
	background-color: #cecece;
}

.num { text-align:right; padding-right:4px; }
.red   { color:#ff0000; }
.green { color:#00ff00; }
.blue  { color:#0000ff; }
.hidden  { visibility:hidden; }
.visible { visibility:visible; }
</style>
<!-- ANGULAR -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-touch.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-animate.js"></script>
<script src="http://ui-grid.info/docs/grunt-scripts/csv.js"></script>
<script src="http://ui-grid.info/docs/grunt-scripts/pdfmake.js"></script>
<script src="http://ui-grid.info/docs/grunt-scripts/vfs_fonts.js"></script>
<!-- JQUERY -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- GRID -->
<script src="http://ui-grid.info/release/ui-grid.js"></script>

<script>
function showProgress() {
	var progress = '<div id="progress" style="position:absolute;width:100%;height:100%;opacity:0.3;z-index:100;background:#000;margin:0 auto;text-align:center;"><img src="/html/images/loading.gif" style="position:relative;top:30%;"/></div>';
	$("body").prepend(progress);
}

function hideProgress() {
	$("#progress").remove();
}

</script>

</head>
<body ng-app="4100" ng-controller="ctrl4100">
<h1 ng-bind="title" class="title"></h1>
<br><hr>
<div>
	<form ng-model="frm1" ng-submit="search()" novalidate>
		<select ng-model="code.team_cd" ng-change="chg1()">
			<option value="">전체</option>
			<option ng-repeat="x in teamlist" value="{{x.dept_cd}}">{{x.dept_nm}}</option>
		</select>
		
		<select id="part_cd" ng-model="code.part_cd" ng-change="chg2()">
			<option value="">전체</option>
			<option ng-repeat="x in partlist" value="{{x.dept_cd}}">{{x.dept_nm}}</option>
		</select>
		 <!--ng-options="partlist.dept_nm for partlist in partlist track by partlist.dept_cd"-->
		
		<select id="area_cd" ng-model="code.area_cd" ng-change="chg3()">
			<option value="">전체</option>
			<option ng-repeat="x in arealist" value="{{x.area_cd}}">{{x.area_nm}}</option>
		</select>

		<input type="text" id="yymm" ng-model="code.yymm">

		<select id="schlevel" ng-model="code.schlevel">
			<option value="0" selected>팀단위</option>
			<option value="1">파트단위</option>
			<option value="2">지역단위</option>
		</select>
			
		<button type="submit" class="btn1" id="btn1" ng-model="btn1">조회</button>
		<button type="button" class="btn1" id='toggleFiltering' ng-click="toggleFiltering()">필터</button>
	</form>
</div>
<hr>

<!-- GRID -->
<div id="datagrid1" ui-grid="gridOptions1" class="datagrid" ui-grid-selection ui-grid-exporter ui-grid-resize-columns ui-grid-auto-resize></div>

<script>
var app = angular.module('4100', [
									'ngAnimate',
									'ngTouch',
									'ui.grid',
									'ui.grid.edit',
									'ui.grid.autoResize',
								  	'ui.grid.resizeColumns',
								  	'ui.grid.selection',
								  	'ui.grid.exporter'
								 ]);

app.controller('ctrl4100', function($scope, $http, uiGridConstants) {

	//init variables
	$scope.title = "입금율현황조회";
	$scope.code = {};
	$scope.code.yymm = "201706";
	$scope.gridOptions1 = {
		//sorting
		enableSorting: 					true,
	
		//filtering
		enableFiltering: 				false,

		//selection
		rowHeight:						20,
		selectionRowHeaderWidth:		27,
		enableRowHeaderSelection:		true,
		enableRowSelection:				true,
		enableSelectAll:				true,
		modifierKeysToMultiSelectCells: true,
		multiSelect:					true,		
		
		//footer				
		showGridFooter:					true,
		showColumnFooter:				true,
		keyDownOverrides: 				[ { keyCode: 39, ctrlKey: true }],
		
		//export
		enableGridMenu:					true,
		enableSelectAll:				true,
		exporterCsvFilename: 			'myFile.csv',
		exporterPdfDefaultStyle: {fontSize: 9},
	    exporterPdfTableStyle: {margin: [30, 30, 30, 30]},
	    exporterPdfTableHeaderStyle: {fontSize: 10, bold: true, italics: true, color: 'red'},
	    exporterPdfHeader: { text: "My Header", style: 'headerStyle' },
	    exporterPdfFooter: function ( currentPage, pageCount ) {
	      return { text: currentPage.toString() + ' of ' + pageCount.toString(), style: 'footerStyle' };
	    },
	    exporterPdfCustomFormatter: function ( docDefinition ) {
	      docDefinition.styles.headerStyle = { fontSize: 22, bold: true };
	      docDefinition.styles.footerStyle = { fontSize: 10, bold: true };
	      return docDefinition;
	    },
	    exporterPdfOrientation: 'portrait',
	    exporterPdfPageSize: 'LETTER',
	    exporterPdfMaxGridWidth: 500,
	    exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location"))

	};

	$scope.gridOptions1.onRegisterApi = function(gridApi) {
      $scope.gridApi = gridApi;
    };

	$scope.gridOptions1.columnDefs = [
			  { name:'팀',   		field: 'dept_nm' , 		minWidth:100, footerCellTemplate: '<div style="text-align:center;"><span class="lable1">합계</span></div>'},
			  { name:'파트',   		field: 'part_nm' , 		width:150, 	pinnedLeft:true},
			  { name:'지역',     	field: 'area_nm' , 		width:100, 	pinnedLeft:true},
			  { name:'센터',  		field: 'bo_nm' , 		width:120},
			  { name:'센터장',   		field: 'bo_head_nm' , 	width:150, 	pinnedLeft:true},
			  { name:'센터코드', 		field: 'bo_cd' , 		width:100, 	pinnedLeft:true},
			  { name:'순번',    		field: 'bo_seq' , 		width:100, 	pinnedLeft:true},
			  { name:'부수',			field: 'qty' , 			width:100, 	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
			  { name:'이월미수',		field: 'cyov_bal' , 	width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num red', 	cellFilter: 'number', footerCellFilter: 'number' },
			  { name:'순매출액',		field: 'net_sale_amt', 	width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
			  { name:'입금액1',		field: 'amt1', 			width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
  			  { name:'입금액2',		field: 'amt2', 			width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
  			  { name:'소계',			field: 'sub_tot_amt', 	width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
 			  { name:'입금액3',		field: 'amt3', 			width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
			  { name:'총계',			field: 'tot_amt', 		width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
 			  { name:'입금액4',		field: 'amt4', 			width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellFilter: 'number', footerCellFilter: 'number' },
			  { name:'당월미수',		field: 'bal_amt', 		width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num blue', 	cellTemplate: '<span>{{COL_FIELD|number}}</span>', footerCellFilter: 'number' },
			  { name:'입금율',		field: 'rcpm_rate', 	width:100,	aggregationType: uiGridConstants.aggregationTypes.sum, aggregationHideLabel: true, cellClass: 'num', 		cellTemplate: '<span>{{COL_FIELD|number}}</span>', footerCellFilter: 'number' },
			  { name:'사업자번호',	field: 'bo_ern', 		width:100,  cellClass: 'visible' }
		]
	;

	//ready function
	$http.get("/se/rcp/4100?dev=Y").then(function (response) {
        $scope.teamlist = response.data.root.comboSet.teamlist.record;
        $scope.partlist = response.data.root.comboSet.partlist.record;
        $scope.arealist = response.data.root.comboSet.arealist.record;
    });


    $scope.chg1 = function() {
    	//alert($scope.code.team_cd);
    };
    
    $scope.chg2 = function() {
    	//alert($scope.code.part_cd);
    };

    $scope.chg3 = function() {
    	//alert($scope.code.area_cd);
    };


	//search function
    $scope.search = function() {

    	showProgress();
    	
		$http({
			method  : 'POST',
			url     : '/se/rcp/4110?dev=Y',
			data    : $.param($scope.code),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded' }
		}).success(function(data, status) {
			$scope.gridOptions1.data = data.root.gridData.record;
			hideProgress();
		});
    };
    

	//toggle filtering
	$scope.toggleFiltering = function() {
		$scope.gridOptions1.enableFiltering = !$scope.gridOptions1.enableFiltering;
		$scope.gridApi.core.notifyDataChange( uiGridConstants.dataChange.COLUMN );
	};

})
/*
	.filter('number', function() {
	  return function(input) { return addCommaStr(input); };
	});
*/	
;

//grid.getCellValue(row, col)|

</script>

</body>
</html>