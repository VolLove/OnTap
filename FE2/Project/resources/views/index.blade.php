<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="{{ url('css/style.css', []) }}">
    <link rel="icon" href="{{ url('images/logomark.min.svg', []) }}">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>

<body>
    <div class="container">
        <div class="slider" id="slider">
        </div>
    </div>
    <div class="box" id="box">
        <div class="content">
            <button id="btn-close">
                <i class="fa-solid fa-xmark"></i>
            </button>
            <div class="box-content" id="box-content">
                content
            </div>
        </div>
    </div>
    <h1>content</h1>
</body>
<script src="{{ url('js/scrip.js', []) }}"></script>

</html>
