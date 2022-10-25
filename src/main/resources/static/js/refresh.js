$(document).ready(function() {
    setInterval(function(){
        showOrderTable();
    }, 5000);
});

function showOrderTable(){
    $("#orderTableData").remove()
    url = "orderDetails";
    htmlForTable '<table class="table table-striped" id="orderTableData">
    <thead>
        <tr>
	        <th scope="col">Order Id</th>
            <th scope="col">Customer Name</th>
            <th scope="col">Product Name</th>
            <th scope="col">Price</td>
        </tr>
    </thead>
    <tbody>';
    htmlForTableData = '';
    $.get(url, function(responseJSON) {
    $.each(responseJSON, function(index, order) {
      htmlForTableData += '<tr><td>' + order.orderId + '</td><td>' + order.customerName + '</td><td>' + order.productName + '</td><td>' + order.price + '</td></tr>';
});
}).done(function(){
	htmlForTable = htmlForTable + htmlForTableData +  '</tbody></table>';
	${"#orderTable"}.append(htmlForTable);
}).fail(function(){
alert("Error: could not connect to server or server encountered an error.")
});
}