# A project to demonstrate a bug with a map implementation.

The problem with text in button.

# Versions
 - Kotlin 2.2.0
 - CMP 1.8.2
 - MapLibre - 0.10.4

Bug can fix when set in text custom front.

```Kotlin
Button(onClick = { showContent = !showContent }) {
   Text("Click me!", fontFamily = FontFamily(Font(Res.font.sf_pro)))
}
```

| Normal | Bug | Fix | 
| ------------- | ------------- | ------------- |
| <img width="1170" height="2532" alt="IMG_2197" src="https://github.com/user-attachments/assets/cd5b653a-2911-4714-9db6-9e4040ff1914" />  | <img width="1170" height="2532" alt="IMG_2198" src="https://github.com/user-attachments/assets/1db6f4f1-716e-446f-b58b-d0f8ded12f52" /> | <img width="1170" height="2532" alt="IMG_2200" src="https://github.com/user-attachments/assets/1a860cef-6720-4995-9144-908bafcfc4ba" />
| [branch](https://github.com/kalist28/MapLibreIosBag/tree/without_map) | [branch](https://github.com/kalist28/MapLibreIosBag/tree/main) | [branch](https://github.com/kalist28/MapLibreIosBag/tree/withFont) |

