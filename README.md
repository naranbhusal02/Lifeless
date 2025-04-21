# 🛠️ Custom Minecraft Mod - Inventora(v1)

This is a simple Minecraft Forge mod that adds **5 new Custom Items** and **5 new Custom Blocks**, including **3 Glowing Blocks**! It's perfect for learning how to add custom content while keeping everythingclean,unique, and fun.

---

## 🔧 Requirements
- Minecraft `1.21.x`
- Forge `1.21.x`
- IDE like `InteliJ IDEA or Eclipse`
- Game Version: `Java Edition`

---

## 🚀 Setup Instruction
1. Clone this repository or copy the project files into your Forge workspace.
2. Open the project in your IDE.
3. Run 'genInteliJRuns' (or 'setupDecompoWorkspace' for Eclipse).
4. Place tectures under the **resources/assets/craftedbynaran/textures/item/** and **texture/block/**.
5. Run the mod using the client run configuration

---

## 📦 Mod Features
| Block Name            | Description                                                                                                                       | Properties                        |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------|-----------------------------------|
| **Alexandrite Block** | Emits strong light. A block form of the cusstom item added named **Alexandrite**                                                  | `LightLevel = 15`, `Strength 4.0` |
| **Naran Block**       | A simple block that can be used as an image by defining the images as a texture and it does not glow.                             | `Non-Glowing`, `Strength 4.0`     |
| **Orange Block**      | Warm, bright block with orange glow and orange texture.                                                                           | `LightLevel = 20`, `Strength 4.8` |
| **Night Owls Block**  | Smooth white stone used to build structure and in this the pixeleted 16*16px image of Night Owls Logo is used as texture.         | `Non-glowing`, `Strength 4.0`     |
| **Love Block**        | Decorative block in which Love heart pixeleted design is used as texture and a clean greenigh background with a glowing property. | `LightLevel = 17`, `Strength 4.0` |


---

## 🧰 Custom Items

| Item Name           | Description                                                             | Use Case                                                   |
|---------------------|-------------------------------------------------------------------------|------------------------------------------------------------|
| **Alexandrite**     | A custom gem like diamond which looks cool and great to see.            | Showcase                                                   |
| **Raw Alexandrite** | A custom item representing the raw form of the custom item Alexandrite. | Decoration                                                 |
| **Love**            | A Love signifying item shaped like a love heart representation .        | Emotion Representaion                                      |
| **Hack**            | A custom item shaped like the Hackclub Flag Sticker.                    | USed to signify Hackclub in designs                        |
| **Icecream**        | A custom item shaped like an **Icecream** as a resemblance of .         | Signifying the SWIRL Workshop done by member of Night Owls |


## 📁 File Structure Overview

```plaintext
src/
├── main/
│   ├── java/
│   │   └── net/
│   │       └── naran/
│   │           └── lifeless/
│   │               ├── block/               # All custom blocks
│   │               ├── item/                # All custom items
│   │               ├── Config.java          # Configuration or registry setup
│   │               └── craftthisthing.java  # Main mod file
│   └── resources/
│       ├── assets/
│       │   └── craftedbynaran/
│       │       ├── blockstates/             # Blockstate JSONs
│       │       ├── lang/                    # Language localization files
│       │       ├── models/
│       │       │   ├── block/               # Block model JSONs
│       │       │   └── item/                # Item model JSONs
│       │       └── textures/
│       │           ├── block/               # Block textures (PNG)
│       │           └── item/                # Item textures (PNG)
│       └── META-INF/                        # Mod metadata


```
## 🙏Credits
Created by <a href="https://naranbhusal02.me">naranbhusal02</a> as a Minecraft modding project for a HACKCRAFT workshop.<br>
**Special thanks to the Minecraft Forge community for their helpful documentation.**

## 📜 License
All rights reserved by <a href="https://github.com/naranbhusal02">@naranbhusal02</a>.